package np.com.test.tip_cal

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : ComponentActivity() {
    private lateinit var etBillAmount: EditText
    private lateinit var etTipPercent: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvTipResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tip_cal_main)

        etBillAmount = findViewById(R.id.etBillAmount)
        etTipPercent = findViewById(R.id.etTipPercent)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvTipResult = findViewById(R.id.tvTipResult)

        btnCalculate.setOnClickListener {
            calculateTip()
        }
    }

    private fun calculateTip() {
        val billAmountStr = etBillAmount.text.toString()
        val tipPercentStr = etTipPercent.text.toString()

        if (billAmountStr.isNotEmpty() && tipPercentStr.isNotEmpty()) {
            val billAmount = billAmountStr.toDouble()
            val tipPercent = tipPercentStr.toDouble()
            val tipAmount = (billAmount * tipPercent) / 100

            tvTipResult.text = "Tip Amount: $${"%.2f".format(tipAmount)}"
        } else {
            tvTipResult.text = "Please enter both values"
        }
    }
}
