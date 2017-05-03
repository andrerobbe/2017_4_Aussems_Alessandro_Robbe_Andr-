/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.havi.ui.HComponent;

/**
 *
 * @author student
 */
public class Draw extends HComponent {
    int to_draw;
    public Draw()
    {
           this.setBounds(310,200,100,100); 
    }
int man7[][]=  {   { 0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0} };


int man6[][]=  {   { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0} };


int man5[][]=  {   { 1,1,1,1,1,1,1,1},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0} };


int man4[][]=  {   { 1,1,1,1,1,1,1,1},
                    { 1,0,1,0,0,0,0,0},
                    { 1,1,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0} };


int man3[][]=  {   { 1,1,1,1,1,1,1,1},
                    { 1,0,1,0,0,1,0,0},
                    { 1,1,0,0,0,1,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0} };



int man2[][]=  {   { 1,1,1,1,1,1,1,1},
                    { 1,0,1,0,0,1,0,0},
                    { 1,1,0,0,0,1,0,0},
                    { 1,0,0,0,1,0,1,0},
                    { 1,0,0,0,0,1,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0},
                    { 1,0,0,0,0,0,0,0} };


int man1[][]=  {   { 1,1,1,1,1,1,1,1},
                    { 1,0,1,0,0,1,0,0},
                    { 1,1,0,0,0,1,0,0},
                    { 1,0,0,0,1,0,1,0},
                    { 1,0,0,0,0,1,0,0},
                    { 1,0,0,0,0,1,0,0},
                    { 1,0,0,0,0,1,0,0},
                    { 1,0,0,0,0,0,0,0} };

int man0[][]=  {   { 1,1,1,1,1,1,1,1},
                    { 1,0,1,0,0,1,0,0},
                    { 1,1,0,0,0,1,0,0},
                    { 1,0,0,0,1,0,1,0},
                    { 1,0,0,0,0,1,0,0},
                    { 1,0,0,0,1,1,1,0},
                    { 1,0,0,0,0,1,0,0},
                    { 1,0,0,0,1,0,1,0} };

int man[][]=man7;
        
        
        
        public void paint(Graphics g) {
        switch(to_draw){
            case 0: 
                this.man=this.man0;
            break;
            case 1: 
                this.man=this.man1;
            break;
            case 2: 
                this.man=this.man2;
            break;
            case 3: 
                this.man=this.man3;
            break;
            case 4: 
                this.man=this.man4;
            break;
            case 5: 
                this.man=this.man5;
            break;
            case 6: 
                this.man=this.man6;
            break;
            default:
                this.man=this.man7;
            break;
        }
        super.paint(g);
        g.setColor(Color.WHITE);
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                if (man[i][j]==1) g.fillRect(0+10*j, 0+10*i, 10, 10);
            }
        }
        }
}
