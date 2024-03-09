@file:OptIn(ExperimentalMaterial3Api::class)

package com.trunglt.democompose.components.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trunglt.democompose.R
import com.trunglt.democompose.ui.theme.DemoComposeTheme

@Composable
fun Toolbar(title: String, onBackPressed: () -> Unit) {
    TopAppBar(colors = TopAppBarDefaults.topAppBarColors(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        titleContentColor = MaterialTheme.colorScheme.primary
    ), title = {
        Box(modifier = Modifier.fillMaxSize()) {
            Icon(
                painter = painterResource(id = R.drawable.ic_back_24),
                contentDescription = "",

                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .fillMaxHeight()
                    .clickable {
                        onBackPressed.invoke()
                    }
            )
            Text(
                text = title,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .fillMaxWidth()
                    .align(Alignment.Center)
            )
        }
    })
}

@Preview
@Composable
fun PreviewToolbar() {
    DemoComposeTheme {
        Toolbar(title = "Title of the app", onBackPressed = {})
    }
}