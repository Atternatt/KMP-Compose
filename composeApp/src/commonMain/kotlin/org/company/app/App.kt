package org.company.app

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import arrow.core.getOrElse
import com.m2f.domain.UseCaseModule
import com.m2f.model.CountryPackage
import com.m2f.model.Style
import org.company.app.theme.AppTheme
import org.company.app.theme.Gradient
import org.company.app.theme.Promotion
import org.company.app.ui.Currency
import org.company.app.ui.Currency.*
import org.company.app.ui.Footer
import org.company.app.ui.Footer.*
import org.company.app.ui.Header
import org.company.app.ui.Header.*
import org.company.app.ui.PackageItem
import org.company.app.ui.PackageItem.*
import org.company.app.ui.PackageItem.RowItem.*
import org.company.app.ui.PackageSim
import org.company.app.utils.toColor

@Composable
internal fun App(
    systemAppearance: (isLight: Boolean) -> Unit = {}
) = AppTheme(systemAppearance) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        val slug by remember {
            mutableStateOf("germany")
        }

        var packageList: List<CountryPackage> by remember {
            mutableStateOf(emptyList())
        }

        LaunchedEffect(slug) {
            UseCaseModule {
                packageList = getPackageList(slug).getOrElse { emptyList() }
            }
        }
        LazyColumn {
            packageList.forEach {
                item(it.id) {
                    Spacer(modifier = Modifier.height(16.dp))
                    with(it) {
                        val color = Gradient(
                            start = operator.gradientStartColorHex.toColor(),
                            end = operator.gradientEndColorHex.toColor()
                        )
                        PackageSim(style = operator.getStyle(), colors = color) {
                            Headers {
                                +OperatorCountry(
                                    operator.title,
                                    operator.countries.first().title
                                )
                            }
                            Rows {
                                +Data(data = data)
                                +Validity(validity = validity)
                                +DiscountPrice(price = price, USD)
                            }
                            Footers(Style.Light) {
                                useDivider = true
                                background = Promotion
                                +Promotion(
                                    20,
                                    price - (price * 0.2),
                                    USD
                                )
                                +ViewPackage {}
                            }
                        }
                    }
                }
            }
        }
    }

//    var email by remember { mutableStateOf("") }
//    var password by remember { mutableStateOf("") }
//    var passwordVisibility by remember { mutableStateOf(false) }
//
//    Column(modifier = Modifier.fillMaxSize().windowInsetsPadding(WindowInsets.safeDrawing)) {
//
//        Row(
//            horizontalArrangement = Arrangement.Center
//        ) {
//            Text(
//                text = "Login",
//                style = MaterialTheme.typography.titleMedium,
//                modifier = Modifier.padding(16.dp)
//            )
//
//            Spacer(modifier = Modifier.weight(1.0f))
//
//            var isDark by LocalThemeIsDark.current
//            IconButton(
//                onClick = { isDark = !isDark }
//            ) {
//                Icon(
//                    modifier = Modifier.padding(8.dp).size(20.dp),
//                    imageVector = if (isDark) rememberLightMode() else rememberDarkMode(),
//                    contentDescription = null
//                )
//            }
//        }
//
//        OutlinedTextField(
//            value = email,
//            onValueChange = { email = it },
//            label = { Text("Email") },
//            singleLine = true,
//            modifier = Modifier.fillMaxWidth().padding(16.dp)
//        )
//
//        OutlinedTextField(
//            value = password,
//            onValueChange = { password = it },
//            label = { Text("Password") },
//            singleLine = true,
//            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
//            modifier = Modifier.fillMaxWidth().padding(16.dp),
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Password
//            ),
//            trailingIcon = {
//                IconButton(onClick = { passwordVisibility = !passwordVisibility }) {
//                    val imageVector = if (passwordVisibility) Icons.Default.Close else Icons.Default.Edit
//                    Icon(imageVector, contentDescription = if (passwordVisibility) "Hide password" else "Show password")
//                }
//            }
//        )
//
//        Button(
//            onClick = { /* Handle login logic here */ },
//            modifier = Modifier.fillMaxWidth().padding(16.dp)
//        ) {
//            Text("Login")
//        }
//
//        TextButton(
//            onClick = { openUrl("https://github.com/terrakok") },
//            modifier = Modifier.fillMaxWidth().padding(16.dp)
//        ) {
//            Text("Open github")
//        }
//    }
}

internal expect fun openUrl(url: String?)