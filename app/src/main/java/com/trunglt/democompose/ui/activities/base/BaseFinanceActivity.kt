package com.trunglt.democompose.ui.activities.base

import android.os.Bundle
import androidx.activity.compose.setContent
import com.trunglt.democompose.ui.screens.base.BaseFinanceScreen
import com.trunglt.democompose.ui.theme.DemoComposeTheme

abstract class BaseFinanceActivity : BaseActivity() {
    abstract fun initTransfer()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoComposeTheme {
                BaseFinanceScreen(
                    title = getToolbarTitle(),
                    onBackPressed = {
                        onBackPressed()
                    },
                    mainLayout = { MainContent() },
                    initTransfer = {
                        initTransfer()
                    })
            }
        }
    }
}