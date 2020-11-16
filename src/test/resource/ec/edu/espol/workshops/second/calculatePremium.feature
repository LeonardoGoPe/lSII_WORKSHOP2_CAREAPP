Feature:Maximum age exceeded regardless of fields
Scenario:Person over the age of 80 does not qualify
Given the person is 85 years old
When age is entered
Then show -1

Scenario Outline: Do you exceed the maximum age or not ?
Given the person is  <age> years old
When age is entered
Then they should tell me <answer>
Examples:
| age | answer |
|<80 | capable |
|>80 | not capable |
|=80 | capable |


Feature:Are you of legal age ?
Scenario:Person under the age of 18 does not qualify
Given the person is 16 years old
When age is entered
Then show -1

Scenario Outline: Are you of legal age or not?
Given the person is  <age> years old
When age is entered
Then they should tell me <answer>
Examples:
| age | answer |
|<18| not capable |
|>18 capable
|=18 capable |


Feature:The driver's license has 9 digits ?
Scenario:Person has a driver's license with less than 9 digits
Given The person has only 8 digits on their license
When license is entered
Then show -1

Scenario Outline: The driver's license has 9 digits or not ?
Given the person has only 8 digits on their "<license>"
When license is entered
Then they should tell me <answer>
Examples:
| license | answer |
|=9 digits| capable |
|>9 digits | not capable |
|<9 digits | not capable |


Feature:Your gender has the corresponding letters M or F ?
Scenario:Person has a letter of his/her gender that does not correspond to M or F
Given The person has a letter S in his/her gender
When gender is entered
Then show -1

Scenario Outline: Your gender has the corresponding letters M or F or not ?
Given the person has a letter S in his/her "<gender>"
When gender is entered
Then they should tell me <answer>
Examples:
| gender | answer |
|=M digits| capable |
|=F digits | Capable |
|=S | not capable |