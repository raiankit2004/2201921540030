select p.product_id, IFNULL(round(sum(p.price*u.units)/sum(u.units),2),0) as average_price
from prices p 
left join UnitsSold u
on p.product_id=u.product_id
AND u.purchase_date>=p.start_date
and u.purchase_date<=p.end_date
group by p.product_id;