# 10 = 0
# 11 = 1
# 00 = 2
# 01 = unused

#                           0b0000_0000_0000_0010_1010_1010_1010_1010
scoreboard players set #0 _ 699050
scoreboard players operation #1 _ = #0 _
scoreboard players operation #1 _ *= 4096 _

execute if score #1 _ matches ..-1 run data remove storage generic_arity_3: _[4]
execute if score #1 _ matches ..-1073741825 run data remove storage generic_arity_3: _[3]
execute if score #1 _ matches -1073741824..-1 run data modify storage generic_arity_3: _ append value []
execute if score #1 _ matches 0.. run data modify storage generic_arity_3: _ append from storage generic_arity_3: 2[]

scoreboard players operation #1 _ *= 4 _
execute if score #1 _ matches ..-1 run data remove storage generic_arity_3: _[-3][4]
execute if score #1 _ matches ..-1073741825 run data remove storage generic_arity_3: _[-3][3]
execute if score #1 _ matches -1073741824..-1 run data modify storage generic_arity_3: _[-3] append value []
execute if score #1 _ matches 0.. run data modify storage generic_arity_3: _[-3] append from storage generic_arity_3: 2[]

scoreboard players operation #1 _ *= 4 _
execute if score #1 _ matches ..-1 run data remove storage generic_arity_3: _[-3][-3][4]
execute if score #1 _ matches ..-1073741825 run data remove storage generic_arity_3: _[-3][-3][3]
execute if score #1 _ matches -1073741824..-1 run data modify storage generic_arity_3: _[-3][-3] append value []
execute if score #1 _ matches 0.. run data modify storage generic_arity_3: _[-3][-3] append from storage generic_arity_3: 2[]

scoreboard players operation #1 _ *= 4 _
execute if score #1 _ matches ..-1 run data remove storage generic_arity_3: _[-3][-3][-3][4]
execute if score #1 _ matches ..-1073741825 run data remove storage generic_arity_3: _[-3][-3][-3][3]
execute if score #1 _ matches -1073741824..-1 run data modify storage generic_arity_3: _[-3][-3][-3] append value []
execute if score #1 _ matches 0.. run data modify storage generic_arity_3: _[-3][-3][-3] append from storage generic_arity_3: 2[]

scoreboard players operation #1 _ *= 4 _
execute if score #1 _ matches ..-1 run data remove storage generic_arity_3: _[-3][-3][-3][-3][4]
execute if score #1 _ matches ..-1073741825 run data remove storage generic_arity_3: _[-3][-3][-3][-3][3]
execute if score #1 _ matches -1073741824..-1 run data modify storage generic_arity_3: _[-3][-3][-3][-3] append value []
execute if score #1 _ matches 0.. run data modify storage generic_arity_3: _[-3][-3][-3][-3] append from storage generic_arity_3: 2[]

scoreboard players operation #1 _ *= 4 _
execute if score #1 _ matches ..-1 run data remove storage generic_arity_3: _[-3][-3][-3][-3][-3][4]
execute if score #1 _ matches ..-1073741825 run data remove storage generic_arity_3: _[-3][-3][-3][-3][-3][3]
execute if score #1 _ matches -1073741824..-1 run data modify storage generic_arity_3: _[-3][-3][-3][-3][-3] append value []
execute if score #1 _ matches 0.. run data modify storage generic_arity_3: _[-3][-3][-3][-3][-3] append from storage generic_arity_3: 2[]

scoreboard players operation #1 _ *= 4 _
execute if score #1 _ matches ..-1 run data remove storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][4]
execute if score #1 _ matches ..-1073741825 run data remove storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][3]
execute if score #1 _ matches -1073741824..-1 run data modify storage generic_arity_3: _[-3][-3][-3][-3][-3][-3] append value []
execute if score #1 _ matches 0.. run data modify storage generic_arity_3: _[-3][-3][-3][-3][-3][-3] append from storage generic_arity_3: 2[]

scoreboard players operation #1 _ *= 4 _
execute if score #1 _ matches ..-1 run data remove storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][-3][4]
execute if score #1 _ matches ..-1073741825 run data remove storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][-3][3]
execute if score #1 _ matches -1073741824..-1 run data modify storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][-3] append value []
execute if score #1 _ matches 0.. run data modify storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][-3] append from storage generic_arity_3: 2[]

scoreboard players operation #1 _ *= 4 _
execute if score #1 _ matches ..-1 run data remove storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][-3][-3][4]
execute if score #1 _ matches ..-1073741825 run data remove storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][-3][-3][3]
execute if score #1 _ matches -1073741824..-1 run data modify storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][-3][-3] append value []
execute if score #1 _ matches 0.. run data modify storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][-3][-3] append from storage generic_arity_3: 2[]

scoreboard players operation #1 _ *= 4 _
execute if score #1 _ matches ..-1 run data remove storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][-3][-3][-3][4]
execute if score #1 _ matches ..-1073741825 run data remove storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][-3][-3][-3][3]
execute if score #1 _ matches -1073741824..-1 run data modify storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][-3][-3][-3] append value []
execute if score #1 _ matches 0.. run data modify storage generic_arity_3: _[-3][-3][-3][-3][-3][-3][-3][-3][-3] append from storage generic_arity_3: 2[]
