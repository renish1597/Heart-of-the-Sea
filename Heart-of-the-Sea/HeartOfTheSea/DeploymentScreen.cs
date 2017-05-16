using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HeartOfTheSea
{
    public class DeploymentScreen
    {
        private List<Point> _mousePoints = new List<Point>();
        private Random _random = new Random();
        private Card card1;
        private Card card2;
        private Card card3;
        private Card card4;
        private Card card5;
        private Card card6;
        private Card card7;
        private Card card8;
        private Card dupCard1;
        private Card dupCard2;
        private Card dupCard3;
        private Card dupCard4;
        private Card dupCard5;
        private Card dupCard6;
        private Card dupCard7;
        private Card dupCard8;
        private Card _firstClicked = null;
        private Card _secondClicked = null;
        private Label _scoreValue;
        Timer flipTimer;
        Timer flipTimer2;
        int _score = 0;
        int _count = 0;
        private Form _windowsForm;

        public Card FirstClicked
        {
            get
            {
                return _firstClicked;
            }

            set
            {
                _firstClicked = value;
            }
        }

        public Card SecondClicked
        {
            get
            {
                return _secondClicked;
            }

            set
            {
                _secondClicked = value;
            }
        }

        public int Score
        {
            get
            {
                return _score;
            }

            set
            {
                _score = value;
            }
        }

        public DeploymentScreen()
        {
            _windowsForm = new Form();
        }
        public DeploymentScreen(Form windowsForm)
        {
            _windowsForm = windowsForm;
        }
        public void AddControls()
        {
            AddCards();
            AddPanel();
            AddTimer();
            AddLabel();
        }

        public void AddCards()
        {
           

        }

        public void AddPanel()
        {
          

        }

        public void AddTimer()
        {

        }

        public void AddLabel()
        {
         
        }


        private void card1_Click(object sender, EventArgs e)
        {
          
        }

        private void dupCard1_Click(object sender, EventArgs e)
        {
            
        }

        private void card2_Click(object sender, EventArgs e)
        {
           
        }

        private void dupCard2_Click(object sender, EventArgs e)
        {
          
        }

        private void card3_Click(object sender, EventArgs e)
        {
         
        }

        private void dupCard3_Click(object sender, EventArgs e)
        {
           
        }

        private void card4_Click(object sender, EventArgs e)
        {
           
        }

        private void dupCard4_Click(object sender, EventArgs e)
        {
         
        }

        private void card5_Click(object sender, EventArgs e)
        {
          
        }

        private void dupCard5_Click(object sender, EventArgs e)
        {
        }

        private void card6_Click(object sender, EventArgs e)
        {
        }

        private void dupCard6_Click(object sender, EventArgs e)
        {
        }

        private void card7_Click(object sender, EventArgs e)
        {
        }

        private void dupCard7_Click(object sender, EventArgs e)
        {
        }

        private void card8_Click(object sender, EventArgs e)
        {
        }

        private void dupCard8_Click(object sender, EventArgs e)
        {
        }
        public void CheckCards(Card cardClicked)
        {
           
        }
        private void flipTimer_Tick(object sender, EventArgs e)
        {
           
        }

        private void flipTimer2_Tick(object sender, EventArgs e)
        {
           
        }

        public void ExecuteTimer1()
        {
        }

        public void ExecuteTimer2()
        {
          
        }
    }
}
