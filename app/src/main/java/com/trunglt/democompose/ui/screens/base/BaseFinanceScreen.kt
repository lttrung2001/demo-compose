package com.trunglt.democompose.ui.screens.base

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trunglt.democompose.previews.Conversation
import com.trunglt.democompose.samples.SampleData
import com.trunglt.democompose.ui.theme.DemoComposeTheme

@Composable
fun BaseFinanceScreen(
    title: String,
    onBackPressed: () -> Unit = {},
    initTransfer: () -> Unit,
    bottomButtonsLayout: @Composable () -> Unit = {
        Button(
            onClick = initTransfer, modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Continue", textAlign = TextAlign.Center)
        }
    },
    mainLayout: @Composable () -> Unit
) {
    BaseScreen(title = title, onBackPressed = onBackPressed) {
        Column(Modifier.fillMaxSize()) {
            Box(modifier = Modifier.weight(1f)) {
                mainLayout.invoke()
            }
            Box(Modifier.padding(16.dp)) {
                bottomButtonsLayout.invoke()
            }
        }
    }
}

@Preview
@Composable
fun PreviewBaseFinanceScreen() {
    DemoComposeTheme {
        BaseFinanceScreen(
            title = "Toolbar title",
            onBackPressed = {

            },
            mainLayout = {
                Conversation(messages = SampleData.conversationSample)
            },
            initTransfer = {

            })
    }
}