package com.trunglt.democompose.ui.activities

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.trunglt.democompose.components.common.Toolbar

@Composable
fun BaseScreen(
    title: String, onBackPressed: () -> Unit = {}, layout: @Composable () -> Unit
) {
    Column {
        Toolbar(title = title, onBackPressed)
        layout.invoke()
    }
}