import { useState } from "react";
import axios from "../services/api";
import { useNavigate } from "react-router-dom";

export default function Login() {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const navigate = useNavigate();

  const handleLogin = async () => {
    try {
      const res = await axios.post("/auth/login", { username, password });
      if(res.data.role === "TEACHER") navigate("/teacher");
      else navigate("/student");
    } catch(err) {
      alert("Login failed");
    }
  }

  return (
    <div className="min-h-screen bg-primary flex items-center justify-center">
      <div className="bg-secondary p-8 rounded-lg shadow-lg w-96">
        <h1 className="text-2xl font-bold text-white mb-6">Login</h1>
        <input type="text" placeholder="Username" value={username} onChange={e => setUsername(e.target.value)} className="w-full mb-4 p-2 rounded"/>
        <input type="password" placeholder="Password" value={password} onChange={e => setPassword(e.target.value)} className="w-full mb-4 p-2 rounded"/>
        <button onClick={handleLogin} className="w-full bg-accent text-white p-2 rounded hover:bg-red-500 transition">Login</button>
      </div>
    </div>
  )
}
