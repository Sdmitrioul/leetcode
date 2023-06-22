--Write an SQL query to find all dates' Id with higher temperatures compared to its previous dates (yesterday).
--Return the result table in any order.
--The query result format is in the following example.

SELECT r.id
FROM weather r
WHERE exists(select w.id
             from weather w
             where w.recorddate = r.recorddate - INTERVAL '1 day'
               AND w.temperature < r.temperature);

SELECT r.id
FROM weather r
         join weather w
              ON r.recorddate = w.recorddate + INTERVAL '1 day'
                  AND r.temperature > w.temperature;