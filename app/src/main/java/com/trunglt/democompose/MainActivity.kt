package com.trunglt.democompose

import android.widget.Toast
import androidx.compose.runtime.Composable
import com.trunglt.democompose.previews.Conversation
import com.trunglt.democompose.samples.SampleData
import com.trunglt.democompose.ui.activities.base.BaseFinanceActivity

class MainActivity : BaseFinanceActivity() {
    override fun initTransfer() {
        Toast.makeText(this, "initTransfer", Toast.LENGTH_SHORT).show()
    }

    override fun getToolbarTitle(): String {
        return "Dashboard"
    }

    @Composable
    override fun MainContent() {
        Conversation(messages = SampleData.conversationSample)
    }
}