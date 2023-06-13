scoreboard players add #1 _ 1
scoreboard players operation #2 _ = #1 _

scoreboard players set #4 _ 0

scoreboard players operation #0 _ *= 65536 _
scoreboard players operation #2 _ *= 65536 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run function generic_arity_2:touch_skip/15
execute if score #4 _ matches ..0 if score #0 _ matches ..-1 if score #2 _ matches 0.. run function generic_arity_2:touch_skip/15
execute if score #4 _ matches ..0 run function generic_arity_2:touch_skip/b14

scoreboard players operation #0 _ = #1 _
