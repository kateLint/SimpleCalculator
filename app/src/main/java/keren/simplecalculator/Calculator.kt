package keren.simplecalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import keren.simplecalculator.ui.theme.LightGray
import keren.simplecalculator.ui.theme.MediumGray
import keren.simplecalculator.ui.theme.MediumLightGray
import keren.simplecalculator.ui.theme.Orange

@Composable
fun Calculator (
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorActions) -> Unit
    ){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(MediumLightGray)){
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .align(Alignment.BottomCenter)
            ,
            verticalArrangement = Arrangement.Bottom


        ){
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier.fillMaxWidth()
                    .padding(vertical = 32.dp),
            fontWeight = FontWeight.Light,
                maxLines = 2,
                fontSize = 80.sp,
                color = Color.White
            )
            //First Row
            Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){

                //AC Button
                CalculatorButton(symbol = "AC", modifier = Modifier.background(LightGray).aspectRatio(2f).weight(2f),
                onClick = {
                    onAction(CalculatorActions.Clear)
                })

                //Delete button
                CalculatorButton(symbol = "Del", modifier = Modifier.background(LightGray).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Delete)
                    })

                //Devide Button
                CalculatorButton(symbol = "/", modifier = Modifier.background(Orange).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Divide))
                    })

            }

            //Second Row
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){

                //7 Button
                CalculatorButton(symbol = "7", modifier = Modifier.background(MediumGray).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(7))
                    })

                CalculatorButton(symbol = "8", modifier = Modifier.background(MediumGray).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(8))
                    })

                CalculatorButton(symbol = "9", modifier = Modifier.background(MediumGray).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(9))
                    })
                CalculatorButton(symbol = "*", modifier = Modifier.background(Orange).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Multiply))
                    })

            }

            //Third Row
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){

                //7 Button
                CalculatorButton(symbol = "4", modifier = Modifier.background(MediumGray).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(4))
                    })

                CalculatorButton(symbol = "5", modifier = Modifier.background(MediumGray).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(5))
                    })

                CalculatorButton(symbol = "6", modifier = Modifier.background(MediumGray).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(6))
                    })
                CalculatorButton(symbol = "-", modifier = Modifier.background(Orange).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Subtract))
                    })

            }
            //Forth Row
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){

                //7 Button
                CalculatorButton(symbol = "1", modifier = Modifier.background(MediumGray).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(1))
                    })

                CalculatorButton(symbol = "2", modifier = Modifier.background(MediumGray).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(2))
                    })

                CalculatorButton(symbol = "3", modifier = Modifier.background(MediumGray).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(3))
                    })
                CalculatorButton(symbol = "+", modifier = Modifier.background(Orange).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Add))
                    })

            }

            //Fifth Row
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){

                //0 Button
                CalculatorButton(symbol = "0", modifier = Modifier.background(MediumGray).aspectRatio(2f).weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Number(0))
                    })

                CalculatorButton(symbol = ".", modifier = Modifier.background(MediumGray).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Decimal)
                    })

                CalculatorButton(symbol = "=", modifier = Modifier.background(Orange).aspectRatio(1f).weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Calculate)
                    })
            }

        }
    }
}