package com.speed.irc.event;

import com.speed.irc.types.Notice;

/**
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
public class NoticeEvent implements IRCEvent {
    protected Notice notice;
    protected Object source;

    public NoticeEvent(final Notice notice, final Object source) {
        this.notice = notice;
        this.source = source;
    }

    public Notice getNotice() {
        return notice;
    }

    public Object getSource() {
        return source;
    }

    public void callListener(IRCEventListener listener) {
        if (listener instanceof NoticeListener) {
            ((NoticeListener) listener).noticeReceived(this);
        }
    }
}
