scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run function generic_arity_2:touch_skip/13
execute if score #4 _ matches ..0 if score #0 _ matches ..-1 if score #2 _ matches 0.. run function generic_arity_2:touch_skip/13
execute if score #4 _ matches ..0 run function generic_arity_2:touch_skip/b12
