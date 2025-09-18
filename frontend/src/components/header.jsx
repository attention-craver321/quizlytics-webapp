export default function Header() {
  return (
    <header className="bg-primary p-4 text-white flex justify-between items-center">
      <h1 className="text-2xl font-bold">Quizlytics</h1>
      <button className="bg-accent px-3 py-1 rounded">Logout</button>
    </header>
  );
}
