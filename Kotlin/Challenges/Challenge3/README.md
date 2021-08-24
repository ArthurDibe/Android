## Challenge 3 - Description 
There is a country called Lolipad, all the inhabitants are happy to pay their taxes, as they know that there are no corrupt politicians in it and the funds collected are used for the benefit of the population, without any deviation. The currency of this country is the Loli, whose symbol is the R$.

You will be challenged to read a value to two decimal places, equivalent to a Loli person's salary. Then calculate and show the amount that this person must pay in Income Tax, according to the table below.<br>
<br>
| INCOME                                                                                                | INCOME TAX                   |
|-------------------------------------------------------------------------------------------------------|------------------------------|
| from 0.00 to R$2000.00<br>from R$2000.01 to R$3000.00<br>from R$3000.01 to R$4500.00<br>above 4500.00 | Free<br>8  %<br>18 %<br>28 % |

<br>
Remember that if the salary is R$3002.00, the rate is 8% only on R$1000.00, as the salary range that is from R$0.00 to R$2000.00 is exempt from income tax. In the example provided (below), the rate is 8% over R$1000.00 + 18% over R$2.00, which results in R$80.36 in total. The value must be printed with two decimal places.<br>
<br>

\-> **INPUT**<br>
The input contains only a floating point value, with two decimal places.<br>
<br>

\-> **OUTPUT**<br>
Print the text "R$" followed by a space and the total amount due for Income Tax, with two places after the period. If the input value is less than or equal to 2000, the message "Free" must be printed.<br>
<br>

| INPUT EXAMPLE                 | OUTPUT EXAMPLE                |
|-------------------------------|-------------------------------|
| 3002.00<br>1701.12<br>4520.00 | R$ 80.36<br>Free<br>R$ 355.60 |