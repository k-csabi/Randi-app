import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './App.css';

function App() {
  const [message, setMessage] = useState('');
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    axios.get('/api/test')
      .then(response => {
        setMessage(response.data);
        setLoading(false);
      })
      .catch(error => {
        console.error('Error fetching data:', error);
        setMessage('Error connecting to backend');
        setLoading(false);
      });
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <h1>❤️ Randi App ❤️</h1>
        {loading ? (
          <p>Loading...</p>
        ) : (
          <div>
            <p>Backend Status: {message}</p>
            <p>Frontend mukodik!</p>
          </div>
        )}
      </header>
    </div>
  );
}

export default App;
