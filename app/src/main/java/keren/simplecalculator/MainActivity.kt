package keren.simplecalculator


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import keren.simplecalculator.ui.theme.CalculatorPrepTheme
import keren.simplecalculator.ui.theme.MediumGray

class MainActivity  : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorPrepTheme{
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpace = 8.dp
                Calculator(state = state,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MediumGray)
                        .padding(16.dp),
                onAction = viewModel::onAction,
               )
            }
        }
    }
}