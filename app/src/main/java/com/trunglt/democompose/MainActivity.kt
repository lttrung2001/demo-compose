package com.trunglt.democompose

import androidx.compose.runtime.Composable
import com.trunglt.democompose.previews.Conversation
import com.trunglt.democompose.samples.SampleData
import com.trunglt.democompose.ui.activities.base.BaseActivity

class MainActivity : BaseActivity() {
    override fun getToolbarTitle(): String {
        return "Dashboard"
    }

    @Composable
    override fun MainContent() {
        Conversation(messages = SampleData.conversationSample)
    }
}