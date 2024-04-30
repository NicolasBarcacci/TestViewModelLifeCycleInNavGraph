package com.accor.testviewmodellifecycleinnavgraph.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CommonView(
    modifier: Modifier = Modifier,
    screenName: String,
    textName: String,
    onButtonClick: () -> Unit
) {
    Column {
        Text(screenName)
        Button(onClick = onButtonClick) {
            Text(text = textName)
        }
    }
}