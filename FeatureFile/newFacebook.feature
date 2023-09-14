Feature:Facebook
Scenario Outline:checking login page
Given Browser Launch 
When user give to "<userName>" and "<Password>"
And user click to loginButton
Then take "<Screenshot>"
Examples:
|userName|Password|Screenshot|
|Nandhini|123456|Nandy|
|Naga|123456|Bell|
|Prabu|123456|Iyar|

