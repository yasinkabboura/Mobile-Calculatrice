package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.math.MathUtils;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText screen = null;
    double Resultat=0;
    double Calc(double value,double R,char op)  {
        switch (op){
            case '+':
                return R + value;
            case '-':
                return R - value;
            case '*':
                return R * value;
            case '/':
                if(value == 0){
                    screen.setText("Syntax Error");
                }
                return R / value;
        }
        return 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen);
        final Button btn1 = findViewById(R.id.button1);
        final Button btn2 = findViewById(R.id.button2);
        final Button btn3 = findViewById(R.id.button3);
        final Button btn4 = findViewById(R.id.button4);
        final Button btn5 = findViewById(R.id.button5);
        final Button btn6 = findViewById(R.id.button6);
        final Button btn7 = findViewById(R.id.button7);
        final Button btn8 = findViewById(R.id.button8);
        final Button btn9 = findViewById(R.id.button9);
        final Button btn0 = findViewById(R.id.button0);
        final Button btnplus = findViewById(R.id.buttonplus);
        final Button btnmoin = findViewById(R.id.buttonmoin);
        final Button btnfois = findViewById(R.id.buttonfois);
        final Button btnAC = findViewById(R.id.buttonAC);
        final Button btnegale = findViewById(R.id.buttonegal);
        final Button btndiviser = findViewById(R.id.buttondiviser);

        final Button btnX2 = findViewById(R.id.buttoX);
        final Button btnSquareX = findViewById(R.id.btnSX);
        final Button btnFactX = findViewById(R.id.buttonXF);
        final Button btnSin = findViewById(R.id.buttoSin);
        final Button btnCos = findViewById(R.id.btnCos);
        final Button btnTan = findViewById(R.id.buttonTan);
        final Button btnLn = findViewById(R.id.buttoLn);
        final Button btnOp = findViewById(R.id.btnOp);
        final Button btnCl = findViewById(R.id.buttonC);
        final Button btnPi = findViewById(R.id.buttopi);
        final Button btnExpo = findViewById(R.id.btne);
        final Button btnMod = findViewById(R.id.buttonmod);
        final Button btnXY = findViewById(R.id.buttoXY);
        final Button btnPOINT = findViewById(R.id.btnPOINT);
        final Button buttonX3 = findViewById(R.id.buttonX3);


        //buttons actons
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"9");
            }
        });
        btnCl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+")");
            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"Cos(");
            }
        });
        btnExpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"e(");
            }
        });
        btnFactX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"!");
            }
        });
        btnLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"ln(");
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"log(");
            }
        });
        btnOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"(");
            }
        });
        btnPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"π");
            }
        });
        btnPOINT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+".");
            }
        });
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"Sin(");
            }
        });
        btnSquareX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"√(");
            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"Tan(");
            }
        });
        btnX2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"^(2)");
            }
        });
        buttonX3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"^(3)");
            }
        });
        btnXY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"^(");
            }
        });









        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("");
                Resultat=0;

            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"+");
            }
        });
        btnmoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"-");
            }
        });
        btnfois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"*");
            }
        });
        btndiviser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"/");
            }
        });
        btnegale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String st = screen.getText().toString();
                    Resultat=Clculate(st);
                    screen.setText(Resultat+"");
                } catch (Exception e) {
                    screen.setText("Syntax error");
                }

            }
        });


    }
    //fonction qui permet de calculer une chaine de caractère
    public double Clculate(String OpString) throws Exception {
        double R=0;
        double Number = 0;
        char OP=' ';
        try {
            for (int i = 0; i < OpString.length(); i++) {
                if (OpString.charAt(i) == '+' || OpString.charAt(i) == '-' || OpString.charAt(i) == '*' || OpString.charAt(i) == '/') {
                    if (OP != ' ') {
                        R = Calc(Number, R, OP);
                        Number = 0;
                        OP = OpString.charAt(i);
                    } else {
                        OP = OpString.charAt(i);
                        R = Number;
                        Number = 0;
                    }
                } else if (OpString.charAt(i) == '(') {
                    String OP2 = "";
                    int Par = 0;
                    i++;
                    do {
                        OP2 = OP2 + OpString.charAt(i);
                        i++;
                        if (OpString.charAt(i) == '(') {
                            Par++;
                        } else if (OpString.charAt(i) == ')') {
                            if(Par >0){
                                OP2 = OP2 + OpString.charAt(i);
                                i++;
                            }
                            Par--;
                        }
                    } while (OpString.charAt(i) != ')' || Par > 0);
                    Number = Clculate(OP2);
                } else if (OpString.charAt(i) == 'S') {
                    String OP2 = "";
                    int Par = 0;
                    i = i + 4;
                    do {
                        OP2 = OP2 + OpString.charAt(i);
                        i++;
                        if (OpString.charAt(i) == '(') {
                            Par++;
                        } else if (OpString.charAt(i) == ')') {
                            if(Par >0){
                                OP2 = OP2 + OpString.charAt(i);
                                i++;
                            }
                            Par--;
                        }
                    } while (OpString.charAt(i) != ')' || Par > 0);
                    Number = Math.sin(Clculate(OP2));
                } else if (OpString.charAt(i) == 'T') {
                    String OP2 = "";
                    int Par = 0;
                    i = i + 4;
                    do {
                        OP2 = OP2 + OpString.charAt(i);
                        i++;
                        if (OpString.charAt(i) == '(') {
                            Par++;
                        } else if (OpString.charAt(i) == ')') {
                            if(Par >0){
                                OP2 = OP2 + OpString.charAt(i);
                                i++;
                            }
                            Par--;
                        }
                    } while (OpString.charAt(i) != ')' || Par > 0);
                    Number = Math.tan(Clculate(OP2));
                } else if (OpString.charAt(i) == 'C') {
                    String OP2 = "";
                    int Par = 0;
                    i = i + 4;
                    do {
                        OP2 = OP2 + OpString.charAt(i);
                        i++;
                        if (OpString.charAt(i) == '(') {
                            Par++;
                        } else if (OpString.charAt(i) == ')') {
                            if(Par >0){
                                OP2 = OP2 + OpString.charAt(i);
                                i++;
                            }
                            Par--;
                        }
                    } while (OpString.charAt(i) != ')' || Par > 0);
                    Number = Math.cos(Clculate(OP2));
                } else if (OpString.charAt(i) == '^') {
                    String OP2 = "";
                    int Par = 0;
                    i = i + 2;
                    do {
                        OP2 = OP2 + OpString.charAt(i);
                        i++;
                        if (OpString.charAt(i) == '(') {
                            Par++;
                        } else if (OpString.charAt(i) == ')') {
                            if(Par >0){
                                OP2 = OP2 + OpString.charAt(i);
                                i++;
                            }
                            Par--;
                        }
                    } while (OpString.charAt(i) != ')' || Par > 0);
                    Number = Math.pow(Number, Clculate(OP2));
                } else if (OpString.charAt(i) == '√') {
                    String OP2 = "";
                    int Par = 0;
                    i = i + 2;
                    do {
                        OP2 = OP2 + OpString.charAt(i);
                        i++;
                        if (OpString.charAt(i) == '(') {
                            Par++;
                        } else if (OpString.charAt(i) == ')') {
                            if(Par >0){
                                OP2 = OP2 + OpString.charAt(i);
                                i++;
                            }
                            Par--;
                        }
                    } while (OpString.charAt(i) != ')' || Par > 0);
                    Number = Math.sqrt(Clculate(OP2));
                } else if (OpString.charAt(i) == 'l') {
                    String OP2 = "";
                    int Par = 0;
                    if (OpString.charAt(i + 1) == 'n') {
                        i = i + 3;
                        do {
                            OP2 = OP2 + OpString.charAt(i);
                            i++;
                            if (OpString.charAt(i) == '(') {
                                Par++;
                            } else if (OpString.charAt(i) == ')') {
                                if(Par >0){
                                    OP2 = OP2 + OpString.charAt(i);
                                    i++;
                                }
                                Par--;
                            }
                        } while (OpString.charAt(i) != ')' || Par > 0);
                        Number = Math.log(Clculate(OP2));
                    } else {
                        i = i + 4;
                        do {
                            OP2 = OP2 + OpString.charAt(i);
                            i++;
                            if (OpString.charAt(i) == '(') {
                                Par++;
                            } else if (OpString.charAt(i) == ')') {
                                if(Par >0){
                                    OP2 = OP2 + OpString.charAt(i);
                                    i++;
                                }
                                Par--;
                            }
                        } while (OpString.charAt(i) != ')' || Par > 0);
                        Number = Math.log10(Clculate(OP2));
                    }

                } else if (OpString.charAt(i) == 'e') {
                    String OP2 = "";
                    int Par = 0;
                    i = i + 2;
                    do {
                        OP2 = OP2 + OpString.charAt(i);
                        i++;
                        if (OpString.charAt(i) == '(') {
                            Par++;
                        } else if (OpString.charAt(i) == ')') {
                            if(Par >0){
                                OP2 = OP2 + OpString.charAt(i);
                                i++;
                            }
                            Par--;
                        }
                    } while (OpString.charAt(i) != ')' || Par > 1);
                    Number = Math.exp(Clculate(OP2));
                } else if (OpString.charAt(i) == '!') {
                    double RF = 0;
                    for (int factor = 2; factor <= Number; factor++) {
                        RF *= factor;
                    }
                    Number = RF;
                } else if (OpString.charAt(i) == 'π') {
                    Number = Math.PI;
                } else if (OpString.charAt(i) == '.') {
                    String OP2 = "0.";
                    do {
                        OP2 = OP2 + OpString.charAt(i + 1);
                        i++;
                    } while ((i < OpString.length() - 1) && (OpString.charAt(i + 1) != '+' && OpString.charAt(i + 1) != '-' && OpString.charAt(i + 1) != '*' && OpString.charAt(i + 1) != '/') && OpString.charAt(i + 1) != '^');
                    Number = Number + Double.parseDouble(OP2);
                } else {
                    Number = (Number * 10) + Double.parseDouble(String.valueOf(OpString.charAt(i)));
                }
            }
            if (OP == ' ') {
                if(Number != 0){
                    return Number;
                }
                else{
                    throw new Exception();
                }

            } else {
                R = Calc(Number, R, OP);
                return R;
            }
        }catch (Exception e ){
            throw new Exception();
        }

    }
}