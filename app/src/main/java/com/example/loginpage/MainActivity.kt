package com.example.loginpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginpage.ui.theme.ColorOfWelcomeText
import com.example.loginpage.ui.theme.LoginPageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            login()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun login() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.top_background),
                contentDescription = "top_background",
                contentScale = ContentScale.FillBounds
            )
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo",
                modifier = Modifier
                    .height(150.dp)
            )
            Text(
                text = "Welcome to Beauty Ui",
                fontSize = 30.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                color = ColorOfWelcomeText
            )

            var user by remember {
                mutableStateOf("Username")
            }
            var password by remember {
                mutableStateOf("Password")
            }
            var passwordsVisible by rememberSaveable() {
                mutableStateOf(false)
            }

            TextField(
                value = user,
                onValueChange = { text -> user = text },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(66.dp)
                    .padding(
                        start = 64.dp,
                        end = 64.dp,
                        top = 8.dp,
                        bottom = 8.dp
                    )
                    .border(
                        1.dp,
                        ColorOfWelcomeText,
                        shape = RoundedCornerShape(50)
                    ),
                shape = RoundedCornerShape(50),
                textStyle = TextStyle(
                    textAlign = TextAlign.Center,
                    color = ColorOfWelcomeText,
                    fontSize = 14.sp,

                    ),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )

            TextField(
                value = password,
                onValueChange = { text -> password = text },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(66.dp)
                    .padding(
                        start = 64.dp,
                        end = 64.dp,
                        top = 8.dp,
                        bottom = 8.dp
                    )
                    .border(
                        1.dp,
                        ColorOfWelcomeText,
                        shape = RoundedCornerShape(50)
                    ),
                shape = RoundedCornerShape(50),
                textStyle = TextStyle(
                    textAlign = TextAlign.Center,
                    color = ColorOfWelcomeText,
                    fontSize = 14.sp,

                    ),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                visualTransformation = if (passwordsVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

            Button(
                onClick = {

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(66.dp)
                    .padding(
                        start = 64.dp,
                        end = 64.dp,
                        top = 8.dp,
                        bottom = 8.dp
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ColorOfWelcomeText
                ),
                shape = RoundedCornerShape(50)
            ) {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = "Don't remember password? click here",
                modifier = Modifier
                    .padding(
                        top = 8.dp,
                        bottom = 8.dp
                    ),
                fontSize = 14.sp,
                color = ColorOfWelcomeText
            )

            Row(

            ) {
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "google",
                    modifier = Modifier
                        .padding(8.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.twitter),
                    contentDescription = "twitter",
                    modifier = Modifier
                        .padding(8.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "facebook",
                    modifier = Modifier
                        .padding(8.dp)
                )
            }

            Image(
                painter = painterResource(id = R.drawable.bottom_background),
                contentDescription = "bottom_background",
                contentScale = ContentScale.FillBounds
            )

        }
    }
}
