/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.wearable.composeforwearos

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text

/* Contains individual Wear OS demo composables for the code lab. */

// TODO: Create a Button Composable (with a Row to center)
@Composable
fun ButtonExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {

}

// TODO: Create a Text Composable
@Composable
fun TextExample(modifier: Modifier = Modifier) {

}

// TODO: Create a Card (specifically, an AppCard) Composable
@Composable
fun CardExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {

}

// TODO: Create a Chip Composable
@Composable
fun ChipExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {

}

// TODO: Create a ToggleChip Composable
@Composable
fun ToggleChipExample(modifier: Modifier = Modifier) {

}

// Function only used as a demo for when you start the code lab (removed as step 1).
@Composable
fun StartOnlyTextComposables() {
    Text(
        modifier = Modifier.fillMaxSize(),
        textAlign = TextAlign.Center,
        color = MaterialTheme.colors.primary,
        text = stringResource(R.string.hello_world_starter)
    )
}

/* Previews of Composables. */
// Note: Preview in Android Studio doesn't support the round view yet (coming soon).

// Hello, world starter text preview
@Preview(
    group = "Starter",
    widthDp = WEAR_PREVIEW_ELEMENT_WIDTH_DP,
    heightDp = WEAR_PREVIEW_ELEMENT_HEIGHT_DP,
    apiLevel = WEAR_PREVIEW_API_LEVEL,
    uiMode = WEAR_PREVIEW_UI_MODE,
    backgroundColor = WEAR_PREVIEW_BACKGROUND_COLOR_BLACK,
    showBackground = WEAR_PREVIEW_SHOW_BACKGROUND
)
@Composable
fun StartOnlyTextComposablesPreview() {
    StartOnlyTextComposables()
}


// Button Preview
@Preview(
    group = "Button",
    widthDp = WEAR_PREVIEW_ELEMENT_WIDTH_DP,
    heightDp = WEAR_PREVIEW_ELEMENT_HEIGHT_DP,
    apiLevel = WEAR_PREVIEW_API_LEVEL,
    uiMode = WEAR_PREVIEW_UI_MODE,
    backgroundColor = WEAR_PREVIEW_BACKGROUND_COLOR_BLACK,
    showBackground = WEAR_PREVIEW_SHOW_BACKGROUND
)
@Composable
fun ButtonExamplePreview() {
    ButtonExample(
        modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
        iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center)
    )
}

// Text Preview
@Preview(
    group = "Text",
    widthDp = WEAR_PREVIEW_ROW_WIDTH_DP,
    heightDp = WEAR_PREVIEW_ROW_HEIGHT_DP,
    apiLevel = WEAR_PREVIEW_API_LEVEL,
    uiMode = WEAR_PREVIEW_UI_MODE,
    backgroundColor = WEAR_PREVIEW_BACKGROUND_COLOR_BLACK,
    showBackground = WEAR_PREVIEW_SHOW_BACKGROUND
)
@Composable
fun TextExamplePreview() {
    TextExample(
        modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
    )
}

// Card Preview
@Preview(
    group = "Card",
    widthDp = WEAR_PREVIEW_ROW_WIDTH_DP,
    heightDp = WEAR_PREVIEW_ROW_HEIGHT_DP,
    apiLevel = WEAR_PREVIEW_API_LEVEL,
    uiMode = WEAR_PREVIEW_UI_MODE,
    backgroundColor = WEAR_PREVIEW_BACKGROUND_COLOR_BLACK,
    showBackground = WEAR_PREVIEW_SHOW_BACKGROUND
)
@Composable
fun CardExamplePreview() {
    CardExample(
        modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
        iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center)
    )
}

// Chip Preview
@Preview(
    group = "Chip",
    widthDp = WEAR_PREVIEW_ROW_WIDTH_DP,
    heightDp = WEAR_PREVIEW_ROW_HEIGHT_DP,
    apiLevel = WEAR_PREVIEW_API_LEVEL,
    uiMode = WEAR_PREVIEW_UI_MODE,
    backgroundColor = WEAR_PREVIEW_BACKGROUND_COLOR_BLACK,
    showBackground = WEAR_PREVIEW_SHOW_BACKGROUND
)
@Composable
fun ChipExamplePreview() {
    ChipExample(
        modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
        iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center)
    )
}

// Toggle Chip Preview
@Preview(
    group = "Toggle Chip",
    widthDp = WEAR_PREVIEW_ROW_WIDTH_DP,
    heightDp = WEAR_PREVIEW_ROW_HEIGHT_DP,
    apiLevel = WEAR_PREVIEW_API_LEVEL,
    uiMode = WEAR_PREVIEW_UI_MODE,
    backgroundColor = WEAR_PREVIEW_BACKGROUND_COLOR_BLACK,
    showBackground = WEAR_PREVIEW_SHOW_BACKGROUND
)
@Composable
fun ToggleChipExamplePreview() {
    ToggleChipExample(
        modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
    )
}