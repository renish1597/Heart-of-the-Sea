using Microsoft.VisualStudio.TestTools.UnitTesting;
using HeartOfTheSea;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Drawing;


namespace HeartOfTheSea.Tests
{
    [TestClass()]
    public class CardTests
    {

      

        [TestMethod()]
        public void CheckSize()
        {
            DeploymentScreen dep = new DeploymentScreen();
            Card card1 = new Card(1);

            Assert.AreEqual(card1.Width, 129);
            Assert.AreEqual(card1.Height, 121);
        }

        [TestMethod()]
        public void CheckTag()
        {
            DeploymentScreen dep = new DeploymentScreen();
            Card card1 = new Card(1);

            Assert.AreEqual(card1.Tag, 1);
        }
     


        
    }
}