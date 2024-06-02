const express = require('express');
const bodyParser = require('body-parser');
const { MongoClient } = require('mongodb');

const app = express();
const port = process.env.PORT || 3000;


app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
app.use(express.static(__dirname));

const uri = 'mongodb+srv://SashankAsapu:Sashank30@cluster0.6cbaufs.mongodb.net/BDMS?retryWrites=true&w=majority';

const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

async function connectToMongoDB() {
  try {
    await client.connect();
    console.log('Connected to MongoDB Atlas');
  } catch (err) {
    console.error(err);
  }
}

connectToMongoDB();

app.post('/signup', async (req, res) => {
  try {
    const db = client.db('BDMS');
    const collection = db.collection('login');

    const { username, password } = req.body;

    const existingUser = await collection.findOne({ username });

    if (existingUser) {
      res.status(400).json({ success: false, message: 'Username already exists' });
    } else {
      await collection.insertOne({ username, password });
      res.status(200).json({ success: true, message: 'Sign up successful' });
      res.redirect('/login.html');
    }
  } catch (error) {
    console.error('Error:', error);
    res.status(500).json({ success: false, message: 'Internal Server Error' });
  }
});

app.post('/login', async (req, res) => {
  try {
    const db = client.db('BDMS');
    const collection = db.collection('login');

    const { username, password } = req.body;

    const user = await collection.findOne({ username, password });

    if (user) {
      res.status(200).json({ success: true, message: 'Login successful' });
      res.redirect('/network.html');
    } else {
      res.status(400).json({ success: false, message: 'Invalid username or password' });
    }
  } catch (error) {
    console.error('Error:', error);
    res.status(500).json({ success: false, message: 'Internal Server Error' });
  }
});

app.get('/', (req, res) => {
  res.send('Welcome to the homepage');
});

app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});