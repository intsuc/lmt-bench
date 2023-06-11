scoreboard players add #1 _ 1
scoreboard players operation #0 _ = #1 _
scoreboard players operation #2 _ = #1 _

scoreboard players operation #2 _ *= 65536 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _ append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #2 _ += #2 _
execute if score #2 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #2 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []
