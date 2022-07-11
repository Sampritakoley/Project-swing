# Project-swing
#Consumer Loan Assistant Project Preview:

In this project, we will build a consumer loan assistant. You input a loan balance and yearly interest
rate. You then have two options: (1) enter the desired number of payments and the loan assistant
computes the monthly payment, or (2) enter the desired monthly payment and the loan assistant
determines the number of payments you will make. An analysis of your loan, including total of
payments and interest paid is also provided.
The finished project is saved as LoanAssistant in the \HomeJava\HomeJava Projects\ project
group. Start NetBeans (or your IDE). Open the specified project group. Make LoanAssistant the
main project. Run the project.
All label controls are used for title information. Two button controls are used to compute results
and to start a new analysis. Two small button controls (marked with X; only one is seen at a time)
control whether you compute the number of payments or the payment amount. One button exits the
project. Four text field controls are used for inputs and a large text area is used to present the loan
analysis results.
In this initial configuration, you enter a Loan Balance, an Interest Rate (annual rate as a
percentage) and a Number of Payments value. Click Compute Monthly Payment. The payment
will appear in the ‘yellow’ text field and a complete loan analysis will appear in the large text
field.
So, if I borrow $10,000 at 5.5% interest, I will pay $301.96 for three years (36 months). More
specific details on exact payment amounts, including total interest paid, is shown under Loan
Analysis.
Note the Loan Balance, Interest Rate, and Number of Payments entries remain. Only the
Monthly Payment and the Loan Analysis have been cleared. This lets you try different values
with minimal typing of new entries. Change any entry you like to see different results – or even
change them all.
Notice the Number of Payments box is now yellow. The button with an X has moved to the
Monthly Payment text field. In this configuration, you enter a Loan Balance, an Interest Rate
and a Monthly Payment. The loan assistant will determine how many payments you need to pay
off the loan.
It will take 59 payments (the last one is smaller) to pay off this particular loan. Again, you can
click New Loan Analysis to try other values and see the results.
That’s all you do with the loan assistant project – there’s a lot going on behind the scenes though. The
loan assistant has two modes of operation. It can compute the monthly payment, given the balance,
interest and number of payments. Or, it can compute the number of payments, given the balance,
interest, and payment. The text field representing the computed value is yellow. The button marked X
is used to switch from one mode to the next. To exit the project, click the Exit button.
Suven Internship
You will now build this project in several stages. We first address frame design. We discuss the
controls used to build the form, establish initial properties, and discuss switching from one mode to
the next. And, we address code design in detail. We cover the mathematics behind the financial
computations. We also discuss validation of the input values, making sure the user only types valid
entries.
![test1](https://user-images.githubusercontent.com/109060246/178210213-fbc65a43-1fd3-4217-9898-74efe98600aa.png)
![test2](https://user-images.githubusercontent.com/109060246/178210301-168954b6-6ae5-4173-a928-efc55f5c11a5.png)

