package com.base.androidstartertemplate.presentation.components


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import com.base.androidstartertemplate.R
import com.base.androidstartertemplate.presentation.annotation.MultiplePreviews
import com.base.androidstartertemplate.presentation.extension.h1Medium


@Composable
fun CustomHeadline1(modifier: Modifier = Modifier, text : Int, color: Color = Color.Black) {
    Text(
        text = stringResource(text),
        style = TextStyle.Default.h1Medium(),
        modifier = modifier,
        color = color
    )
    
//    Icon(painter = painterResource(id = Icons.Default.Add), contentDescription = )
}

@MultiplePreviews()
@Composable
fun PreviewTextStyles(){
    CustomHeadline1(text = R.string.hello)
}
