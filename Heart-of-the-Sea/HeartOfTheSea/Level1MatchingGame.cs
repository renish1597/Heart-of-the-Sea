﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HeartOfTheSea
{
    public partial class Level1MatchingGame : Form
    {
        private PauseForm pauseMenu;

        
       
        public Level1MatchingGame()
        {
            InitializeComponent();
           
        }

       
       

       

        private void button_pause_Click(object sender, EventArgs e)
        {
            pauseMenu = new PauseForm();
            pauseMenu.Show();
        }
    }
}