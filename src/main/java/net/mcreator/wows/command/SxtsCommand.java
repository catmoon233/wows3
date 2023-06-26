
package net.mcreator.wows.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.mcreator.wows.procedures.SxtslcProcedure;
import net.mcreator.wows.procedures.Sxtslc9Procedure;
import net.mcreator.wows.procedures.Sxtslc8Procedure;
import net.mcreator.wows.procedures.Sxtslc7Procedure;
import net.mcreator.wows.procedures.Sxtslc6Procedure;
import net.mcreator.wows.procedures.Sxtslc5Procedure;
import net.mcreator.wows.procedures.Sxtslc4Procedure;
import net.mcreator.wows.procedures.Sxtslc3Procedure;
import net.mcreator.wows.procedures.Sxtslc2Procedure;
import net.mcreator.wows.procedures.Sxtslc1Procedure;
import net.mcreator.wows.procedures.Sxtslc17Procedure;
import net.mcreator.wows.procedures.Sxtslc16Procedure;
import net.mcreator.wows.procedures.Sxtslc14Procedure;
import net.mcreator.wows.procedures.Sxtslc13Procedure;
import net.mcreator.wows.procedures.Sxtslc12Procedure;
import net.mcreator.wows.procedures.Sxtslc11Procedure;
import net.mcreator.wows.procedures.Sxtslc10Procedure;

import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class SxtsCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(
				Commands.literal("sxts").requires(s -> s.hasPermission(4)).then(Commands.literal("sm").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SxtslcProcedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("gj").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc2Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("fs").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc3Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("fsbl").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc4Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("fy").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc1Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("ll").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc5Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("llnow").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc7Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("llhf").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc6Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("hdz").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc9Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("hdzhf").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc10Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("hdznow").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc8Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("tlmax").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc11Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("tlnow").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc13Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("tlhf").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc12Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("tlxh").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc14Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("sd").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc16Procedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("ms").then(Commands.argument("name", EntityArgument.players()).then(Commands.argument("leix1", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					Sxtslc17Procedure.execute(arguments);
					return 0;
				})))));
	}
}
