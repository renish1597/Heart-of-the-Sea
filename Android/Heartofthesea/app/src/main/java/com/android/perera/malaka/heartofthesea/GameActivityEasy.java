package com.android.perera.malaka.heartofthesea;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Build;
import android.os.IInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import android.os.Handler;

import com.android.perera.malaka.heartofthesea.R;

import static android.os.Build.VERSION_CODES.M;
import static android.view.View.INVISIBLE;

public class GameActivityEasy extends AppCompatActivity {

    TextView tv_p1;
    //tv_p2;
    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24, iv_31, iv_32, iv_33, iv_34, iv_41, iv_42, iv_43, iv_44;
    ImageButton ib_pause;

    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 107, 108, 201, 202, 203, 204, 205, 206, 207, 208};
    int im101, im102, im103, im104, im105, im106, im107, im108, im201, im202, im203, im204, im205, im206, im207, im208;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    int turn = 1;
    int playerPoints = 0, cpuPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_easy);

        tv_p1 = (TextView) findViewById(R.id.tv_p1);
        // tv_p2 = (TextView) findViewById(R.id.tv_p2);
        ib_pause = (ImageButton) findViewById(R.id.ib_pause);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);
        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_34 = (ImageView) findViewById(R.id.iv_34);
        iv_41 = (ImageView) findViewById(R.id.iv_41);
        iv_42 = (ImageView) findViewById(R.id.iv_42);
        iv_43 = (ImageView) findViewById(R.id.iv_43);
        iv_44 = (ImageView) findViewById(R.id.iv_44);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");
        iv_41.setTag("12");
        iv_42.setTag("13");
        iv_43.setTag("14");
        iv_44.setTag("15");

        //load the card images
        fronOfCardResources();

        //shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));

        //tv_p2.setTextColor(Color.GRAY);

        ib_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPause();
            }
        });

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_11, theCard);

            }
        });


        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_12, theCard);
            }
        });


        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_13, theCard);
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_14, theCard);
            }
        });


        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_21, theCard);
            }
        });


        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_22, theCard);
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_23, theCard);
            }
        });

        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_24, theCard);
            }
        });

        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_31, theCard);
            }
        });

        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_32, theCard);
            }
        });

        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_33, theCard);
            }
        });

        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_34, theCard);
            }
        });

        iv_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_41, theCard);
            }
        });

        iv_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_42, theCard);
            }
        });

        iv_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_43, theCard);
            }
        });

        iv_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_44, theCard);
            }
        });

    }

    public void showPause()
    {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogPView = inflater.inflate(R.layout.pause_dialog, null);
        dialogBuilder.setView(dialogPView);

        Button resumeGame = (Button) dialogPView.findViewById(R.id.resume_game);
        Button mainMenu = (Button) dialogPView.findViewById(R.id.main_menu);

        //dialogBuilder.setTitle("Custom dialog");
        //dialogBuilder.setMessage("Enter text below");

        resumeGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // continue with resume game
                v.setVisibility(INVISIBLE);
                //finish();
            }
        });

        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameActivityEasy.this, MenuActivity.class);
                GameActivityEasy.this.startActivity(intent);
                finish();
            }
        });
        /*dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //do something with edt.getText().toString();
            }
        });
        dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //pass
            }
        });*/
        AlertDialog b = dialogBuilder.create();
        b.show();
    }

    private void doStuff(ImageView iv, int card) {
        //set the correct image to the imageview
        if (cardsArray[card] == 101) {
            iv.setImageResource(im101);
        } else if (cardsArray[card] == 102) {
            iv.setImageResource(im102);
        } else if (cardsArray[card] == 103) {
            iv.setImageResource(im103);
        } else if (cardsArray[card] == 104) {
            iv.setImageResource(im104);
        } else if (cardsArray[card] == 105) {
            iv.setImageResource(im105);
        } else if (cardsArray[card] == 106) {
            iv.setImageResource(im106);
        } else if (cardsArray[card] == 107) {
            iv.setImageResource(im107);
        } else if (cardsArray[card] == 108) {
            iv.setImageResource(im108);
        } else if (cardsArray[card] == 201) {
            iv.setImageResource(im201);
        } else if (cardsArray[card] == 202) {
            iv.setImageResource(im202);
        } else if (cardsArray[card] == 203) {
            iv.setImageResource(im203);
        } else if (cardsArray[card] == 204) {
            iv.setImageResource(im204);
        } else if (cardsArray[card] == 205) {
            iv.setImageResource(im205);
        } else if (cardsArray[card] == 206) {
            iv.setImageResource(im206);
        } else if (cardsArray[card] == 207) {
            iv.setImageResource(im207);
        } else if (cardsArray[card] == 208) {
            iv.setImageResource(im208);
        }

        //check which image is selected and save it to temporary variable
        if (cardNumber == 1) {
            firstCard = cardsArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);

        } else if (cardNumber == 2) {
            secondCard = cardsArray[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);
            iv_41.setEnabled(false);
            iv_42.setEnabled(false);
            iv_43.setEnabled(false);
            iv_44.setEnabled(false);


            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if the selected images are equal
                    calculate();
                }
            }, 500);

        }
    }

    private  void calculate(){
        //if images are equal remove them and add points
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                iv_11.setVisibility(INVISIBLE);
            } else if (clickedFirst == 1) {
                iv_12.setVisibility(INVISIBLE);
            } else if (clickedFirst == 2) {
                iv_13.setVisibility(INVISIBLE);
            } else if (clickedFirst == 3) {
                iv_14.setVisibility(INVISIBLE);
            } else if (clickedFirst == 4) {
                iv_21.setVisibility(INVISIBLE);
            } else if (clickedFirst == 5) {
                iv_22.setVisibility(INVISIBLE);
            } else if (clickedFirst == 6) {
                iv_23.setVisibility(INVISIBLE);
            }else if (clickedFirst == 7) {
                iv_24.setVisibility(INVISIBLE);
            }else if (clickedFirst == 8) {
                iv_31.setVisibility(INVISIBLE);
            }else if (clickedFirst == 9) {
                iv_32.setVisibility(INVISIBLE);
            }else if (clickedFirst == 10) {
                iv_33.setVisibility(INVISIBLE);
            }else if (clickedFirst == 11) {
                iv_34.setVisibility(INVISIBLE);
            }else if (clickedFirst == 12) {
                iv_41.setVisibility(INVISIBLE);
            }else if (clickedFirst == 13) {
                iv_42.setVisibility(INVISIBLE);
            }else if (clickedFirst == 14) {
                iv_43.setVisibility(INVISIBLE);
            }else if (clickedFirst == 15) {
                iv_44.setVisibility(INVISIBLE);
            }

            if (clickedSecond == 0) {
                iv_11.setVisibility(INVISIBLE);
            } else if (clickedSecond == 1) {
                iv_12.setVisibility(INVISIBLE);
            } else if (clickedSecond == 2) {
                iv_13.setVisibility(INVISIBLE);
            } else if (clickedSecond == 3) {
                iv_14.setVisibility(INVISIBLE);
            } else if (clickedSecond == 4) {
                iv_21.setVisibility(INVISIBLE);
            } else if (clickedSecond == 5) {
                iv_22.setVisibility(INVISIBLE);
            } else if (clickedSecond == 6) {
                iv_23.setVisibility(INVISIBLE);
            }else if (clickedSecond == 7) {
                iv_24.setVisibility(INVISIBLE);
            }else if (clickedSecond == 8) {
                iv_31.setVisibility(INVISIBLE);
            }else if (clickedSecond == 9) {
                iv_32.setVisibility(INVISIBLE);
            }else if (clickedSecond == 10) {
                iv_33.setVisibility(INVISIBLE);
            }else if (clickedSecond == 11) {
                iv_34.setVisibility(INVISIBLE);
            } else if (clickedSecond == 12) {
                iv_41.setVisibility(INVISIBLE);
            }else if (clickedSecond == 13) {
                iv_42.setVisibility(INVISIBLE);
            }else if (clickedSecond == 14) {
                iv_43.setVisibility(INVISIBLE);
            }else if (clickedSecond == 15) {
                iv_44.setVisibility(INVISIBLE);
            }

            //add points to the correct player
            playerPoints++;
            tv_p1.setText("SCORE: " + playerPoints);

            if(playerPoints >=8 ) {

                showWinningDialog();
//                AlertDialog.Builder builder;
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
//                } else {
//                    builder = new AlertDialog.Builder(this);
//                }
//                builder.setTitle("\nCongratulations!!")
//                        .setMessage("   You won the Heart of the Sea...")
//                        .setPositiveButton(R.string.new_game, new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int which) {
//                                // continue with New game
//                                Intent intent = new Intent(GameActivityEasy.this, GameActivityEasy.class);
//                                GameActivityEasy.this.startActivity(intent);
//                                finish();
//                            }
//                        })
//                        .setNegativeButton(R.string.main_menu, new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int which) {
//                                // go back to main menu
//                                Intent intent = new Intent(GameActivityEasy.this, MenuActivity.class);
//                                GameActivityEasy.this.startActivity(intent);
//                                finish();
//
//
//                            }
//                        })
//                        .setIcon(R.drawable.ic_favorite_white_24dp)
//                        .show();
            }
        }
        else {
            iv_11.setImageResource((R.drawable.heartlevel1));
            iv_12.setImageResource((R.drawable.heartlevel1));
            iv_13.setImageResource((R.drawable.heartlevel1));
            iv_14.setImageResource((R.drawable.heartlevel1));
            iv_21.setImageResource((R.drawable.heartlevel1));
            iv_22.setImageResource((R.drawable.heartlevel1));
            iv_23.setImageResource((R.drawable.heartlevel1));
            iv_24.setImageResource((R.drawable.heartlevel1));
            iv_31.setImageResource((R.drawable.heartlevel1));
            iv_32.setImageResource((R.drawable.heartlevel1));
            iv_33.setImageResource((R.drawable.heartlevel1));
            iv_34.setImageResource((R.drawable.heartlevel1));
            iv_41.setImageResource((R.drawable.heartlevel1));
            iv_42.setImageResource((R.drawable.heartlevel1));
            iv_43.setImageResource((R.drawable.heartlevel1));
            iv_44.setImageResource((R.drawable.heartlevel1));
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);
        iv_41.setEnabled(true);
        iv_42.setEnabled(true);
        iv_43.setEnabled(true);
        iv_44.setEnabled(true);


    }

    private void fronOfCardResources() {
        im101 = R.drawable.card1;
        im102 = R.drawable.card2;
        im103 = R.drawable.card3;
        im104 = R.drawable.card4;
        im105 = R.drawable.card5;
        im106 = R.drawable.card6;
        im107 = R.drawable.card7;
        im108 = R.drawable.card8;
        im201 = R.drawable.card1;
        im202 = R.drawable.card2;
        im203 = R.drawable.card3;
        im204 = R.drawable.card4;
        im205 = R.drawable.card5;
        im206 = R.drawable.card6;
        im207 = R.drawable.card7;
        im208 = R.drawable.card8;

    }

    public void showWinningDialog()
    {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.win_dialog, null);
        dialogBuilder.setView(dialogView);

        Button newGame = (Button) dialogView.findViewById(R.id.new_game);
        Button mainMenu = (Button) dialogView.findViewById(R.id.main_menu);

        //dialogBuilder.setTitle("Custom dialog");
        //dialogBuilder.setMessage("Enter text below");

        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // continue with New game
                Intent intent = new Intent(GameActivityEasy.this, GameActivityEasy.class);
                GameActivityEasy.this.startActivity(intent);
                finish();
            }
        });

        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameActivityEasy.this, MenuActivity.class);
                GameActivityEasy.this.startActivity(intent);
                finish();
            }
        });
        /*dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //do something with edt.getText().toString();
            }
        });
        dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //pass
            }
        });*/
        AlertDialog b = dialogBuilder.create();
        b.show();
    }

}
