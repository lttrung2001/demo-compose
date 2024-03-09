package com.trunglt.democompose.ui.activities.base

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.trunglt.democompose.ui.screens.base.BaseScreen
import com.trunglt.democompose.ui.theme.DemoComposeTheme

abstract class BaseActivity : ComponentActivity() {
    abstract fun getToolbarTitle(): String

    @Composable
    abstract fun MainContent()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    BaseScreen(title = getToolbarTitle(), onBackPressed = {
                        onBackPressed()
                    }) {
                        MainContent()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DemoComposeTheme {
        Greeting("Android")
    }
}