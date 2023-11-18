package com.bgaprojects.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.bgaprojects.aluvery.sampledata.sampleSections
import com.bgaprojects.aluvery.screens.HomeScreen
import com.bgaprojects.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
private fun App() {
    AluveryTheme {
        Surface {
            HomeScreen(sampleSections)
        }
    }
}
