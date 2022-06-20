//import './App.css';
import ReactDOM from "react-dom/client";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Layout from "./Components/Layout";
import Personal from "./Components/Personal";
import Academic from "./Components/Academic";
import Journey from "./Components/Journey";
import Interest from "./Components/Interest";
import Event from "./Components/Event";
import Feedback from "./Components/Feedback";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route path="personal" element={<Personal />} />
          <Route path="academic" element={<Academic />} />
          <Route path="journey" element={<Journey />} />
          <Route path="interests" element={<Interest />} />
          <Route path="events" element={<Event />} />
          <Route path="feedback" element={<Feedback />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
