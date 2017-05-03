package hellotvxlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.tv.xlet.*;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HState;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;


public class HelloTVXlet implements Xlet,HActionListener {
    HScene scene;
    HStaticText placeholder;
    HStaticText chancesText;
    boolean gameover=false;
    boolean wordguessed=false;
    int chances=7;
    int counter=0;
    String[] words = {"SCHOOL", "COMPUTER", "MULTIMEDIA", "SCHOOLBORD",
                      "QWERTY", "OPLADER", "STROOM", "SMARTBOARD", "AUDIO",
                      "VIDEO", "GAMES", "WEBSITES", "DEVELOPMENT", "LERAAR",
                      "STOEL", "DIGITAAL", "TECHNOLOGY", "RANDOM", "CAMPUS",
                      "JAVASCRIPT", "HTML", "TOETSENBORD", "LAPTOP", "BEAMER",
                      "SCHERM", "LAMPEN", "LOKAAL", "AULA", "KRIJTJE", "STIFT",
                      "CURSUS", "VAKKEN", "DESIGN", "NERD", "WEBCAM", "MICROFOON",
                      "BEDRIJFSLEVEN", "ARMZALIG", "PEN", "PAPIER", "STOPCONTACT",
                      "KABEL", "TESTFASE", "MONDELING", "EXAMEN", "CONCEPT", "PAUZE",
                      "ETEN", "WORSTENBROODJE", "WOORDENBOEK", "FACEBOOK", "INTERNET",
                      "WIFI", "HACKEN", "BEGRAAFPLAATS", "HANGMAN", "SOFTWARE", "HARDWARE",
                      "PIJLTJESTOETSEN", "GELUID", "MERKGEBONDENHEID", "ERASMUS", "ANTWERPEN",
                      "KDG", "SCHERM", "GEBOUW", "CAMPUS"};
    String Word=words[(int) (Math.random() * words.length)];
    char[] wordToGuess=Word.toCharArray();
    char[] placeHolder=new char[wordToGuess.length];
    Draw d=new Draw();
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) {
      for(int i = 0; i<placeHolder.length; i++)
      {
        placeHolder[i]='*';
      }
      scene=HSceneFactory.getInstance().getDefaultHScene();
      scene.setBackgroundMode(HVisible.BACKGROUND_FILL);
      scene.setBackground(Color.BLACK);
      HStaticText tekst1=new HStaticText("Raad het woord.",100,20,500,150);
      chancesText=new HStaticText(String.valueOf(chances),670,10,50,50);
      placeholder=new HStaticText( String.valueOf(placeHolder),100,300,500,150);
      HTextButton A=new HTextButton("A",35,476,50,50);
      HTextButton B=new HTextButton("B",85,476,50,50);
      HTextButton C=new HTextButton("C",135,476,50,50);
      HTextButton D=new HTextButton("D",185,476,50,50);
      HTextButton E=new HTextButton("E",235,476,50,50);
      HTextButton F=new HTextButton("F",285,476,50,50);
      HTextButton G=new HTextButton("G",335,476,50,50);
      HTextButton H=new HTextButton("H",385,476,50,50);
      HTextButton I=new HTextButton("I",435,476,50,50);
      HTextButton J=new HTextButton("J",485,476,50,50);
      HTextButton K=new HTextButton("K",535,476,50,50);
      HTextButton L=new HTextButton("L",585,476,50,50);
      HTextButton M=new HTextButton("M",635,476,50,50);
      HTextButton N=new HTextButton("N",35,526,50,50);
      HTextButton O=new HTextButton("O",85,526,50,50);
      HTextButton P=new HTextButton("P",135,526,50,50);
      HTextButton Q=new HTextButton("Q",185,526,50,50);
      HTextButton R=new HTextButton("R",235,526,50,50);
      HTextButton S=new HTextButton("S",285,526,50,50);
      HTextButton T=new HTextButton("T",335,526,50,50);
      HTextButton U=new HTextButton("U",385,526,50,50);
      HTextButton V=new HTextButton("V",435,526,50,50);
      HTextButton W=new HTextButton("W",485,526,50,50);
      HTextButton X=new HTextButton("X",535,526,50,50);
      HTextButton Y=new HTextButton("Y",585,526,50,50);
      HTextButton Z=new HTextButton("Z",635,526,50,50);
      A.setActionCommand("A");
      B.setActionCommand("B");
      C.setActionCommand("C");
      D.setActionCommand("D");
      E.setActionCommand("E");
      F.setActionCommand("F");
      G.setActionCommand("G");
      H.setActionCommand("H");
      I.setActionCommand("I");
      J.setActionCommand("J");
      K.setActionCommand("K");
      L.setActionCommand("L");
      M.setActionCommand("M");
      N.setActionCommand("N");
      O.setActionCommand("O");
      P.setActionCommand("P");
      Q.setActionCommand("Q");
      R.setActionCommand("R");
      S.setActionCommand("S");
      T.setActionCommand("T");
      U.setActionCommand("U");
      V.setActionCommand("V");
      W.setActionCommand("W");
      X.setActionCommand("X");
      Y.setActionCommand("Y");
      Z.setActionCommand("Z");
      A.addHActionListener((HActionListener) this);
      B.addHActionListener((HActionListener) this);
      C.addHActionListener((HActionListener) this);
      D.addHActionListener((HActionListener) this);
      E.addHActionListener((HActionListener) this);
      F.addHActionListener((HActionListener) this);
      G.addHActionListener((HActionListener) this);
      H.addHActionListener((HActionListener) this);
      I.addHActionListener((HActionListener) this);
      J.addHActionListener((HActionListener) this);
      K.addHActionListener((HActionListener) this);
      L.addHActionListener((HActionListener) this);
      M.addHActionListener((HActionListener) this);
      N.addHActionListener((HActionListener) this);
      O.addHActionListener((HActionListener) this);
      P.addHActionListener((HActionListener) this);
      Q.addHActionListener((HActionListener) this);
      R.addHActionListener((HActionListener) this);
      S.addHActionListener((HActionListener) this);
      T.addHActionListener((HActionListener) this);
      U.addHActionListener((HActionListener) this);
      V.addHActionListener((HActionListener) this);
      W.addHActionListener((HActionListener) this);
      X.addHActionListener((HActionListener) this);
      Y.addHActionListener((HActionListener) this);
      Z.addHActionListener((HActionListener) this);
      
      scene.add(A);
      scene.add(B);
      scene.add(C);
      scene.add(D);
      scene.add(E);
      scene.add(F);
      scene.add(G);
      scene.add(H);
      scene.add(I);
      scene.add(J);
      scene.add(K);
      scene.add(L);
      scene.add(M);
      scene.add(N);
      scene.add(O);
      scene.add(P);
      scene.add(Q);
      scene.add(R);
      scene.add(S);
      scene.add(T);
      scene.add(U);
      scene.add(V);
      scene.add(W);
      scene.add(X);
      scene.add(Y);
      scene.add(Z);
      scene.add(tekst1);
      scene.add(placeholder);
      scene.add(chancesText);
      A.requestFocus();
      A.setFocusTraversal(null, N, M, B);
      B.setFocusTraversal(null,O,A,C);
      C.setFocusTraversal(null,P,B,D);
      D.setFocusTraversal(null,Q,C,E);
      E.setFocusTraversal(null,R,D,F);
      F.setFocusTraversal(null,S,E,G);
      G.setFocusTraversal(null,T,F,H);
      H.setFocusTraversal(null,U,G,I);
      I.setFocusTraversal(null,V,H,J);
      J.setFocusTraversal(null,W,I,K);
      K.setFocusTraversal(null,X,J,L);
      L.setFocusTraversal(null,Y,K,M);
      M.setFocusTraversal(null,Z,L,A);
      N.setFocusTraversal(A,null,Z,O);
      O.setFocusTraversal(B,null,N,P);
      P.setFocusTraversal(C,null,O,Q);
      Q.setFocusTraversal(D,null,P,R);
      R.setFocusTraversal(E,null,Q,S);
      S.setFocusTraversal(F,null,R,T);
      T.setFocusTraversal(G,null,S,U);
      U.setFocusTraversal(H,null,T,V);
      V.setFocusTraversal(I,null,U,W);
      W.setFocusTraversal(J,null,V,X);
      X.setFocusTraversal(K,null,W,Y);
      Y.setFocusTraversal(L,null,X,Z);
      Z.setFocusTraversal(M,null,Y,N);
      
      scene.add(d);
      d.to_draw=this.chances;
      scene.validate();
      scene.setVisible(true);
     
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }
    public void destroyXlet(boolean unconditional) {
     
    }
        public void actionPerformed(ActionEvent arg0) {
        char keypressed=arg0.getActionCommand().charAt(0);
        if(!gameover && !wordguessed)
        {
            int index=new String(wordToGuess).indexOf(keypressed);
            if(index>-1)
            {
                for( int i=0 ; i<wordToGuess.length ; i++)
                {
                    if(wordToGuess[i]==keypressed)
                    {
                        placeHolder[i]=keypressed;
                    }
                }
                placeholder.setTextContent(String.valueOf(placeHolder),HState.NORMAL_STATE); 
                    if(new String(placeHolder).indexOf("*")<=-1)
                    {
                        wordguessed=true;
                        HStaticText tekst2=new HStaticText("GERADEN",100,0,500,50);
                        tekst2.setBackgroundMode(HVisible.BACKGROUND_FILL);
                        tekst2.setBackground(Color.GREEN);
                        scene.add(tekst2);
                        scene.popToFront(tekst2);
                    }
            }
            else
            {
                chances=chances-1;
                d.to_draw=chances;
                d.repaint();
                chancesText.setTextContent(String.valueOf(chances),HState.NORMAL_STATE);
                if(chances==0)
                    {
                        gameover=true;
                        HStaticText tekst2=new HStaticText("GAMEOVER",100,0,500,50);
                        tekst2.setBackgroundMode(HVisible.BACKGROUND_FILL);
                        tekst2.setBackground(Color.RED);
                        scene.add(tekst2);
                        scene.popToFront(tekst2);
                    }
           
            }
        scene.repaint();
        }

    }
}
