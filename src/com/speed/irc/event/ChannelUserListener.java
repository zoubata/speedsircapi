package com.speed.irc.event;

/**
 * Implement this interface and register to the event manager to receive channel
 * user events.
 * <p/>
 * This file is part of Speed's IRC API.
 * <p/>
 * Speed's IRC API is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * <p/>
 * Speed's IRC API is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 * <p/>
 * You should have received a copy of the GNU Lesser General Public License
 * along with Speed's IRC API. If not, see <http://www.gnu.org/licenses/>.
 *
 * @author Shivam Mistry
 * @deprecated
 */
@ListenerProperties(events = ChannelUserEvent.class)
public interface ChannelUserListener extends IRCEventListener {
    void channelUserJoined(ChannelUserEvent e);

    void channelUserParted(ChannelUserEvent e);

    void channelUserModeChanged(ChannelUserEvent e);

    void channelUserKicked(ChannelUserEvent e);

    void channelUserNickChanged(ChannelUserEvent e);

    void channelUserQuit(ChannelUserEvent e);
}
