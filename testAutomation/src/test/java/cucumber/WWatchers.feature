Feature: Weight Watchers Assessment

Scenario Outline: Program-2

Given user is on Weightwatchers page

Then verify the given text

And click on find a meeting link

Then verify if title contains desired text

And search for meeting with zipcode

Then print the title of the result

And click on the first search result and verify location

Then print todays hours of operation

Examples: 
||
||