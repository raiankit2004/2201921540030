# Write your MySQL query statement below
SELECT distinct tweet_id FROM Tweets 
WHERE LENGTH(content)>15;