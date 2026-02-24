# Write your MySQL query statement below
select contest_id , 
round(count(distinct user_id )*100/(select count(user_id) from Users ),2) as percentage
from Register as r
-- right join Users as u 
-- on r.user_id = u.user_id
group by contest_id 
order by percentage  desc , contest_id asc