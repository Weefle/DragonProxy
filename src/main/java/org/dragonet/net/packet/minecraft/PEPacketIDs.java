/*
 * GNU LESSER GENERAL PUBLIC LICENSE
 *                       Version 3, 29 June 2007
 *
 * Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 * Everyone is permitted to copy and distribute verbatim copies
 * of this license document, but changing it is not allowed.
 *
 * You can view LICENCE file for details. 
 *
 * @author The Dragonet Team
 */
package org.dragonet.net.packet.minecraft;

public final class PEPacketIDs {

    public static final byte PING = (byte) 0x00;
    public static final byte PONG = (byte) 0x00;
    public static final byte CLIENT_CONNECT = (byte) 0x09;
    public static final byte SERVER_HANDSHAKE = (byte) 0x10;
    public static final byte CLIENT_HANDSHAKE = (byte) 0x13;

    public final static byte LOGIN_PACKET = (byte) 0x01;
    public final static byte PLAY_STATUS_PACKET = (byte) 0x02;
    public final static byte DISCONNECT_PACKET = (byte) 0x05;
    public final static byte BATCH_PACKET = (byte) 0x06;
    public final static byte TEXT_PACKET = (byte) 0x07;
    public final static byte SET_TIME_PACKET = (byte) 0x08;
    public final static byte START_GAME_PACKET = (byte) 0x09;
    public final static byte ADD_PLAYER_PACKET = (byte) 0x0a;
    public final static byte REMOVE_PLAYER_PACKET = (byte) 0x0b;
    public final static byte ADD_ENTITY_PACKET = (byte) 0x0c;
    public final static byte REMOVE_ENTITY_PACKET = (byte) 0x0d;
    public final static byte ADD_ITEM_ENTITY_PACKET = (byte) 0x0e;
    public final static byte TAKE_ITEM_ENTITY_PACKET = (byte) 0x0f;
    public final static byte MOVE_ENTITY_PACKET = (byte) 0x10;
    public final static byte MOVE_PLAYER_PACKET = (byte) 0x11;
    public final static byte REMOVE_BLOCK_PACKET = (byte) 0x12;
    public final static byte UPDATE_BLOCK_PACKET = (byte) 0x9f;
    public final static byte ADD_PAINTING_PACKET = (byte) 0xa0;
    public final static byte EXPLODE_PACKET = (byte) 0xa1;
    public final static byte LEVEL_EVENT_PACKET = (byte) 0xa2;
    public final static byte BLOCK_EVENT_PACKET = (byte) 0xa3;
    public final static byte ENTITY_EVENT_PACKET = (byte) 0xa4;
    public final static byte MOB_EFFECT_PACKET = (byte) 0xa5;
    public final static byte UPDATE_ATTRIBUTES_PACKET = (byte) 0xa6;
    public final static byte MOB_EQUIPMENT_PACKET = (byte) 0xa7;
    public final static byte MOB_ARMOR_EQUIPMENT_PACKET = (byte) 0xa8;
    public final static byte INTERACT_PACKET = (byte) 0xa9;
    public final static byte USE_ITEM_PACKET = (byte) 0xaa;
    public final static byte PLAYER_ACTION_PACKET = (byte) 0xab;
    public final static byte HURT_ARMOR_PACKET = (byte) 0xac;
    public final static byte SET_ENTITY_DATA_PACKET = (byte) 0xad;
    public final static byte SET_ENTITY_MOTION_PACKET = (byte) 0xae;
    public final static byte SET_ENTITY_LINK_PACKET = (byte) 0xaf;
    public final static byte SET_HEALTH_PACKET = (byte) 0xb0;
    public final static byte SET_SPAWN_POSITION_PACKET = (byte) 0xb1;
    public final static byte ANIMATE_PACKET = (byte) 0xb2;
    public final static byte RESPAWN_PACKET = (byte) 0xb3;
    public final static byte DROP_ITEM_PACKET = (byte) 0xb4;
    public final static byte WINDOW_OPEN_PACKET = (byte) 0xb5;
    public final static byte WINDOW_CLOSE_PACKET = (byte) 0xb6;
    public final static byte WINDOW_SET_SLOT_PACKET = (byte) 0xb7;
    public final static byte WINDOW_SET_DATA_PACKET = (byte) 0xb8;
    public final static byte WINDOW_SET_CONTENT_PACKET = (byte) 0xb9;
    public final static byte CRAFTING_DATA_PACKET = (byte) 0xba;
    public final static byte CRAFTING_EVENT_PACKET = (byte) 0xbb;
    public final static byte ADVENTURE_SETTINGS_PACKET = (byte) 0xbc;
    public final static byte BLOCK_ENTITY_DATA_PACKET = (byte) 0xbd;
    //public final static byte PLAYER_INPUT_PACKET = (byte) 0xbe;
    public final static byte FULL_CHUNK_DATA_PACKET = (byte) 0xbf;
    public final static byte SET_DIFFICULTY_PACKET = (byte) 0xc0;
    public final static byte CHANGE_DIMENSION_PACKET = (byte) 0xc1;
    public final static byte SET_PLAYER_GAMETYPE_PACKET = (byte) 0xc2;
    public final static byte PLAYER_LIST_PACKET = (byte) 0xc3;
    //public final static byte TELEMETRY_EVENT_PACKET = (byte) 0xc4;
    //public final static byte SPAWN_EXPERIENCE_ORB_PACKET = (byte) 0xc5
    public final static byte CLIENTBOUND_MAP_ITEM_DATA_PACKET = (byte) 0xc6;
    public final static byte REPLACE_SELECTED_ITEM_PACKET = (byte) 0xcb;
}
