package com.trunglt.democompose.previews

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.trunglt.democompose.components.MessageCard
import com.trunglt.democompose.models.Message
import com.trunglt.democompose.ui.theme.DemoComposeTheme

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun PreviewMessageCardLightMode() {
    DemoComposeTheme {
        Surface {
            Column {
                MessageCard(msg = Message(author = "Trung Le Thanh", body = "Gioi thieu"))
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewMessageCardNightMode() {
    DemoComposeTheme {
        Surface {
            Column {
                MessageCard(msg = Message(author = "Trung Le Thanh", body = "Gioi thieu"))
            }
        }
    }
}