package com.example.stonepaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView hii;
    TextView start;
    Button st;
    Button pap;
    Button sci;
    TextView res1;
    TextView res2;
    int count,cnum,unum,score;
    int max=3,min=1;
    String chand,uhand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hii=findViewById(R.id.welcome);
        start=findViewById(R.id.play);
        st=findViewById(R.id.stone);
        pap=findViewById(R.id.paper);
        sci=findViewById(R.id.scissor);
        res1=findViewById(R.id.result1);
        res2=findViewById(R.id.result2);
        cnum = (int) (Math.random() * (max - min + 1) + min);
        switch (cnum) {
            case 1:
                chand = "Stone";
                break;
            case 2:
                chand = "Paper";
                break;
            case 3:
                chand = "Scissor";
                break;
            default:
                chand = "Wrong instruction";
                break;
        }
        st.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count<5) {
                        uhand = "Stone";
                        if (chand == "Scissor" && uhand == "Stone") {
                            res1.setText("Yours was stone and android's was scissor");
                            res2.setText("You win");
                            score++;
                        } else if (chand == "Paper" && uhand == "Stone") {
                            res1.setText("Yours was stone and android's was paper");
                            res2.setText("Android wins");
                        } else {
                            res1.setText("Yours was stone and android's was stone");
                            res2.setText("No one wins");
                        }
                        count++;
                        if (count<5) {
                            cnum = (int) (Math.random() * (max - min + 1) + min);
                            switch (cnum) {
                                case 1:
                                    chand = "Stone";
                                    break;
                                case 2:
                                    chand = "Paper";
                                    break;
                                case 3:
                                    chand = "Scissor";
                                    break;
                                default:
                                    chand = "Wrong instruction";
                                    break;
                            }
                        }else {
                            Toast.makeText(MainActivity.this, "You won "+score+" times out of 5", Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        Toast.makeText(MainActivity.this, "Restart the game to play again", Toast.LENGTH_SHORT).show();
                    }

                }
            });
            pap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count<5) {
                        uhand = "Paper";
                        if (chand == "Stone" && uhand == "Paper") {
                            res1.setText("Yours was paper and android's was stone");
                            res2.setText("You win");
                            score++;
                        } else if (chand == "Scissor" && uhand == "Paper") {
                            res1.setText("Yours was paper and android's was scissor");
                            res2.setText("Android wins");
                        } else {
                            res1.setText("Yours was paper and android's was paper");
                            res2.setText("No one wins");
                        }
                        count++;
                        if (count<5) {
                            cnum = (int) (Math.random() * (max - min + 1) + min);
                            switch (cnum) {
                                case 1:
                                    chand = "Stone";
                                    break;
                                case 2:
                                    chand = "Paper";
                                    break;
                                case 3:
                                    chand = "Scissor";
                                    break;
                                default:
                                    chand = "Wrong instruction";
                                    break;
                            }
                        } else {
                            Toast.makeText(MainActivity.this, "You won " + score + " times out of 5", Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        Toast.makeText(MainActivity.this, "Restart the game to play again", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            sci.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count<5) {
                        uhand = "Scissor";
                        if (chand == "Paper" && uhand == "Scissor") {
                            res1.setText("Yours was scissor and android's was paper");
                            res2.setText("You win");
                            score++;
                        } else if (chand == "Stone" && uhand == "Scissor") {
                            res1.setText("Yours was scissor and android's was stone ");
                            res2.setText("Android wins");
                        } else {
                            res1.setText("Yours was scissor and android's was scissor");
                            res2.setText("No one wins");
                        }
                        count++;
                        if (count<5) {
                            cnum = (int) (Math.random() * (max - min + 1) + min);
                            switch (cnum) {
                                case 1:
                                    chand = "Stone";
                                    break;
                                case 2:
                                    chand = "Paper";
                                    break;
                                case 3:
                                    chand = "Scissor";
                                    break;
                                default:
                                    chand = "Wrong instruction";
                                    break;
                            }
                        }else{
                            Toast.makeText(MainActivity.this, "You won " + score + " times out of 5", Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        Toast.makeText(MainActivity.this, "Restart the game to play again", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }
    }
