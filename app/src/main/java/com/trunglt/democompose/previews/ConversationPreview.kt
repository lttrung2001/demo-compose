package com.trunglt.democompose.previews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trunglt.democompose.components.MessageCard
import com.trunglt.democompose.models.Message
import com.trunglt.democompose.samples.SampleData
import com.trunglt.democompose.ui.theme.DemoComposeTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(
            items = messages,
            key = {
                it.id
            }, itemContent = {
                MessageCard(msg = it)
            })
    }
}

@Preview
@Composable
fun PreviewConversationLightMode() {
    DemoComposeTheme {
        Conversation(SampleData.conversationSample)
    }
}