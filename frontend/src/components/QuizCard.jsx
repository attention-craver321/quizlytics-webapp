export default function QuizCard({ quiz, onStart }) {
  return (
    <div className="bg-secondary p-4 rounded-lg shadow-lg mb-4 hover:shadow-xl transition cursor-pointer" onClick={() => onStart(quiz.id)}>
      <h2 className="text-xl font-semibold text-white">{quiz.title}</h2>
      <p className="text-gray-300">{quiz.questions.length} Questions</p>
    </div>
  );
}
