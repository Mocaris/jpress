/**
 * Copyright (c) 2016-2019, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jpress.model;

import com.google.common.collect.Lists;
import io.jboot.db.annotation.Table;
import io.jpress.model.base.BaseAttachment;

import java.util.List;

/**
 * Generated by Jboot.
 */
@Table(tableName = "attachment", primaryKey = "id")
public class Attachment extends BaseAttachment<Attachment> {

    private static List<String> imageSuffix = Lists.newArrayList(".jpg", ".jpeg", ".png", ".bmp", ".gif", ".webp");
    private static List<String> docSuffix = Lists.newArrayList(".doc", ".docx", ".pages", ".dot", ".dotx", ".docm", ".dotm");
    private static List<String> xlsSuffix = Lists.newArrayList(".xls", ".xlsx", ".xltx", ".numbers");
    private static List<String> pptSuffix = Lists.newArrayList(".ppt", ".pptx", ".key", ".ppsx", "potx");
    private static List<String> txtSuffix = Lists.newArrayList(".txt", ".log", ".xml");
    private static List<String> zipSuffix = Lists.newArrayList(".zip");
    private static List<String> rarSuffix = Lists.newArrayList(".rar");
    private static List<String> exeSuffix = Lists.newArrayList(".exe");
    private static List<String> pdfSuffix = Lists.newArrayList(".pdf");
    private static List<String> audioSuffix = Lists.newArrayList(".mp3", ".au", ".cd", ".wma", ".ogg", ".ape", ".flac", ".aiff");
    private static List<String> videoSuffix = Lists.newArrayList(".mp4", ".avi", ".wmv", ".mpeg", ".mov", ".mkv", ".flv", ".rmvb", ".rm", ".3gp", ".ts", ".vob");

    public boolean isImage() {
        return suffixIn(imageSuffix);
    }

    public boolean isDoc() {
        return suffixIn(docSuffix);
    }

    public boolean isXls() {
        return suffixIn(xlsSuffix);
    }

    public boolean isTxt() {
        return suffixIn(txtSuffix);
    }

    public boolean isPpt() {
        return suffixIn(pptSuffix);
    }

    public boolean isZip() {
        return suffixIn(zipSuffix);
    }

    public boolean isRar() {
        return suffixIn(rarSuffix);
    }

    public boolean isExe() {
        return suffixIn(exeSuffix);
    }

    public boolean isPdf() {
        return suffixIn(pdfSuffix);
    }

    public boolean isAudio() {
        return suffixIn(audioSuffix);
    }

    public boolean isVideo() {
        return suffixIn(videoSuffix);
    }

    private boolean suffixIn(List<String> suffixList) {
        String suffix = getSuffix();
        return suffix != null && suffixList.contains(suffix.toLowerCase());
    }

}
