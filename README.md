# Quiz
This Java program is a simple quiz game with a set of predefined questions and answers. Here’s a breakdown of what it does:

Class Definition: The Quiz class is defined with two private member variables: questionAnswerMap (a HashMap to store the question-answer pairs) and questions (an ArrayList to store the questions).

Constructor: In the Quiz() constructor, the questionAnswerMap and questions are initialized. The questions and corresponding answers are added to the questionAnswerMap. The questions are also added to the questions ArrayList.

startQuiz Method: This method begins the quiz game. It creates a Scanner object for user input and initializes a score variable to zero. It then enters a loop that runs 10 times, each time selecting a random question from the questions ArrayList, displaying it, and waiting for the user’s answer. If the user’s answer matches the correct answer (ignoring case), the score is incremented and a “Correct!” message is displayed. Otherwise, an “Incorrect” message along with the correct answer is displayed. The asked question is then removed from the questions ArrayList to avoid repetition.

main Method: This is the entry point of the program. It creates an instance of the Quiz class and calls its startQuiz() method to start the quiz game.

At the end of the quiz, the user’s total score is displayed. Please note that this program does not handle invalid input or errors, so it might crash if the user enters something unexpected.
