using System;
using System.Windows;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using HeartOfTheSea;

namespace HeartOfTheSea.Tests
{
    [TestClass()]
    public class Level1Test
    {
        [TestMethod()]
        public void CheckCardsFirstClickTest()
        {
            DeploymentScreen dep = new DeploymentScreen();
            Card card1 = new Card(1);
            dep.CheckCards(card1);
            Assert.AreEqual(card1, dep.FirstClicked);
        }

        [TestMethod()]
        public void CheckCardsSecondClickTest()
        {
            DeploymentScreen dep = new DeploymentScreen();
            dep.AddControls();
            Card card1 = new Card(1);
            Card card2 = new Card(2);
            dep.CheckCards(card1);
            dep.CheckCards(card2);
            Assert.AreEqual(card1, dep.FirstClicked);
            Assert.AreEqual(card2, dep.SecondClicked);
        }

        [TestMethod()]
        public void ExecuteTimer2Test()
        {
            DeploymentScreen dep = new DeploymentScreen();
            dep.AddControls();
            Card card1 = new Card(1);
            Card card2 = new Card(1);
            dep.CheckCards(card1);
            dep.CheckCards(card2);
            dep.ExecuteTimer2();
            Assert.AreEqual(10, dep.Score);

        }
        [TestMethod()]
        public void CheckScoreNotSame()
        {
            DeploymentScreen dep = new DeploymentScreen();
            dep.AddControls();
            Card card1 = new Card(1);
            Card card2 = new Card(2);

            dep.CheckCards(card1);
            dep.CheckCards(card2);

            dep.ExecuteTimer2();
            Assert.AreNotEqual(10, dep.Score);
        }

        [TestMethod()]
        public void CheckClickTwice()
        {
            DeploymentScreen dep = new DeploymentScreen();
            dep.AddControls();
            Card card1 = new Card(1);

            dep.CheckCards(card1);
            dep.CheckCards(card1);

            Assert.AreEqual(0, dep.Score);
        }
    }
}

