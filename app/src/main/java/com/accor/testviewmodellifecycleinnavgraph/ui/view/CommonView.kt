package com.accor.testviewmodellifecycleinnavgraph.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CommonView(
    modifier: Modifier = Modifier,
    screenName: String,
    navNext: String,
    navNextClick: () -> Unit,
    navVertical: String,
    navVerticalClick: () -> Unit,
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(screenName)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = navNextClick) {
            Text(text = navNext)
        }
        Button(onClick = navVerticalClick) {
            Text(text = navVertical)
        }
    }
}