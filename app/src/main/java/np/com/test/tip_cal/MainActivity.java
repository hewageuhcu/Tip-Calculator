//package np.com.test.tip_cal;
//
//import android.os.Bundle;
//import androidx.activity.ComponentActivity;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//
//class MainActivity extends ComponentActivity {
//     private EditText etBillAmount, etTipPercent;
//     private Button btnCalculate;
//     private TextView tvTipResult;
//@Override
//    protected void onCreate(Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    setContentView(R.layout.tip_cal_main);
//
//    etBillAmount = findViewById(R.id.etBillAmount);
//    etTipPercent = findViewById(R.id.etTipPercent);
//    btnCalculate = findViewById(R.id.btnCalculate);
//    tvTipResult = findViewById(R.id.tvTipResult);
//
//    btnCalculate.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            calculateTip();
//        }
//    });
//}
//
//private void calculateTip(){
//    String billAmountStr=etBillAmount.getText().toString();
//    String tipPercentStr=etTipPercent.getText().toString();
//
//    if(!billAmountStr.isEmpty() && !tipPercentStr.isEmpty()){
//        double billAmount=Double.parseDouble(billAmountStr);
//        double tipPercent=Double.parseDouble(tipPercentStr);
//        double tipAmount=(billAmount*tipPercent)/100;
//
//        tvTipResult.setText("Tip Amount:$"+String.format("%.2f",tipAmount));
//    }else{
//        tvTipResult.setText("Please enter both values");
//    }
//}
//
//}
//
